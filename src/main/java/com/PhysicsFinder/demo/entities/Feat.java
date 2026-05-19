package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Feat {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;
    private Integer level;
    @Enumerated(EnumType.STRING)
    private FeatType featType; // ANCESTRY, CLASS, SKILL, GENERAL

    @ManyToOne
    private CharacterClass characterClass;

    @ManyToOne
    private Ancestry ancestry;

    @ManyToOne
    private Heritage heritage;

    @Column(length = 3000)
    private String description;

    protected Feat() {}

    public Feat(String name, Integer level, FeatType featType, String description) {
        this.name = name;
        this.level = level;
        this.featType = featType;
        this.description = description;
    }
}
