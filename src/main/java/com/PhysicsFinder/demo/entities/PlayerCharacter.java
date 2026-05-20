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
public class PlayerCharacter {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(nullable = false)
    private String name;
    private Integer level = 1;
    @ManyToOne
    private Ancestry ancestry;
    @ManyToOne
    private Heritage heritage;
    @ManyToOne
    private Background background;
    @ManyToOne
    private CharacterClass characterClass;
    private String chosenClassKeyAttribute;
    @ManyToOne
    private Skill chosenBackgroundSkill;
    @ManyToOne
    private Deity deity;

    @ManyToMany
    private List<Skill> chosenClassSkills = new ArrayList<>();

    @Embedded
    private AttributeModifiers attributes = new AttributeModifiers();

    @OneToMany(mappedBy = "playerCharacter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CharacterProficiency> proficiencies = new ArrayList<>();

    @OneToMany(mappedBy = "playerCharacter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SelectedFeat> selectedFeats = new ArrayList<>();

    @OneToMany(mappedBy = "playerCharacter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ChosenAttributeBoost> chosenAttributeBoosts = new ArrayList<>();

    @ManyToMany
    private List<ClassFeatureChoice> selectedClassFeatureChoices = new ArrayList<>();

    private Integer maxHitPoints;
    private Integer speed;
    private Integer armorClass;
    private String size;

}
