package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Heritage {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;
    @Column(length = 2000)
    private String description;

    @Enumerated(EnumType.STRING)
    private HeritageType heritageType;

    @ManyToOne
    private Ancestry ancestry;

    @ElementCollection
    private List<String> traits = new ArrayList<>();

    @ManyToMany
    private List<Ancestry> grantedAncestryFeatAccess = new ArrayList<>();

    protected Heritage() {}

    public Heritage(String name, String description, HeritageType heritageType, Ancestry ancestry) {
        this.name = name;
        this.description = description;
        this.heritageType = heritageType;
        this.ancestry = ancestry;
    }
}
