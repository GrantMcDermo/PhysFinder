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
public class AttributeBoostRule {
    @Id
    @GeneratedValue
    private UUID id;

    @Enumerated(EnumType.STRING)
    private AttributeBoostType boostType;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AttributeName> attributeOptions = new ArrayList<>();

    private Integer numberToChoose = 1;

    @ManyToOne
    private Ancestry ancestry;

    @ManyToOne
    private Background background;

    @ManyToOne
    private CharacterClass characterClass;

    @ManyToOne
    private ClassFeatureChoice classFeatureChoice;

    public AttributeBoostRule(AttributeBoostType boostType, List<AttributeName> attributeOptions, Integer numberToChoose){
        this.boostType = boostType;
        this.attributeOptions = attributeOptions;
        this.numberToChoose = numberToChoose;
    }
}
