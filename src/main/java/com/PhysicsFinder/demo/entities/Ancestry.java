package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    protected Ancestry() {}
    public Ancestry(String name, Integer hitPoints, Integer speed, String size){
        this.name = name;
        this.hitPoints = hitPoints;
        this.speed = speed;
        this.size = size;
    }

}
