package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

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
    @Enumerated(EnumType.STRING)
    private Set<TraitType> traits = new HashSet<>();

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<SenseType> senses = new HashSet<>();

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
