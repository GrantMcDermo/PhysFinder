package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class CharacterClass {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;
    private Integer hitPointsPerLevel;

    @ElementCollection
    private List<String> keyAttributeOptions = new ArrayList<>(); // example: "STRENGTH_OR_DEXTERITY"

    @ElementCollection
    private List<InitialProficiency> initialProficiencies = new ArrayList<>();

    @OneToMany(mappedBy = "characterClass", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClassSkillChoice> skillChoices = new ArrayList<>();

    private Boolean usesDeitySkill = false;
    private Boolean usesDeityFavoredWeapon = false;

    protected CharacterClass() {}

    public CharacterClass(String name, Integer hitPointsPerLevel, List<String> keyAttributeOptions) {
        this.name = name;
        this.hitPointsPerLevel = hitPointsPerLevel;
        this.keyAttributeOptions = keyAttributeOptions;
    }
}
