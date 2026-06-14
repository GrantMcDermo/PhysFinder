package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

@Data
@Entity
public class Ancestry {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;
    private Integer hitPoints;
    private Integer speed;
    private String size;

    @ManyToMany
    private Set<Trait> traits = new HashSet<>();

    @ManyToMany
    private List<Language> startingLanguages = new ArrayList<>();

    @ManyToMany
    private List<Language> recommendedAdditionalLanguages = new ArrayList<>();

    private Integer additionalLanguageBase;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<SenseType> senses = new HashSet<>();

    @OneToMany(mappedBy = "ancestry", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AncestryFeature> features = new ArrayList<>();

    protected Ancestry() {}
    public Ancestry(String name, Integer hitPoints, Integer speed, String size, Set<Trait> traits, List<Language> startingLanguages, List<Language> recommendedAdditionalLanguages, Integer additionalLanguageBase){
        this.name = name;
        this.hitPoints = hitPoints;
        this.speed = speed;
        this.size = size;
        this.traits = traits;
        this.startingLanguages = startingLanguages;
        this.recommendedAdditionalLanguages = recommendedAdditionalLanguages;
        this.additionalLanguageBase = additionalLanguageBase;
    }

}
