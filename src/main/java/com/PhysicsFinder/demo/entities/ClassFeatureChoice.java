package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassFeatureChoice {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    private CharacterClass characterClass;

    private String featureName;
    // Example: "Subconscious Mind", "Racket"

    private String optionName;
    // Example: "Emotional Acceptance", "Gathered Lore", "Mastermind", "Ruffian"

    @Column(length = 2000)
    private String description;

    @OneToMany(mappedBy = "classFeatureChoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FeatureGrantedProficiency> grantedProficiencies = new ArrayList<>();

    @OneToMany(mappedBy = "classFeatureChoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FeatureSkillChoice> skillChoices = new ArrayList<>();

    @OneToMany(mappedBy = "classFeatureChoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FeatureGrantedFeat> grantedFeats = new ArrayList<>();

    @OneToMany(mappedBy = "classFeatureChoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private  List<FeatureGrantedSpells> grantedSpells = new ArrayList<>();

    public ClassFeatureChoice(CharacterClass characterClass, String featureName, String optionName){
        this.characterClass = characterClass;
        this.featureName = featureName;
        this.optionName = optionName;
    }
}
