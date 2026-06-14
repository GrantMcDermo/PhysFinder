package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trait {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private TraitCategory category;

    public Trait(String name, TraitCategory category) {
        this.name = name;
        this.category = category;
    }
}
