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

    @ElementCollection
    private List<String> traits = new ArrayList<>();

    @ElementCollection
    private List<String> languages = new ArrayList<>();

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<SenseType> senses = new HashSet<>();

    @OneToMany(mappedBy = "ancestry", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AncestryFeature> features = new ArrayList<>();

    protected Ancestry() {}
    public Ancestry(String name, Integer hitPoints, Integer speed, String size){
        this.name = name;
        this.hitPoints = hitPoints;
        this.speed = speed;
        this.size = size;
    }

}
