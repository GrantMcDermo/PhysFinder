package com.PhysicsFinder.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity
public class ClassFeatRule {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Feat feat;

    @ManyToOne
    private CharacterClass characterClass;

    private String ruleKey;
    private String description;
}
