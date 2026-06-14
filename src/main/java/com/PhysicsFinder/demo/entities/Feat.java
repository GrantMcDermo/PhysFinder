package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

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

    @ManyToMany
    private Set<Trait> traits = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "feat_available_classes", joinColumns = @JoinColumn(name = "feat_id"), inverseJoinColumns = @JoinColumn(name = "class_id"))
    private List<CharacterClass> availableToClasses = new ArrayList<>();

    @ManyToOne
    private Ancestry ancestry;

    @ManyToOne
    private Heritage heritage;

    @Column(length = 3000)
    private String description;

    protected Feat() {}

    public Feat(String name, Integer level, Set<Trait> traits, String description) {
        this.name = name;
        this.level = level;
        this.traits = traits;
        this.description = description;
    }
}
