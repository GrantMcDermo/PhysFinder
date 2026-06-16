package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Armor {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private ArmorCategory category;

    @Enumerated(EnumType.STRING)
    private ArmorGroup armorGroup;

    @ManyToMany
    private Set<Trait> traits = new HashSet<>();

    private Integer acBonus;

    private Integer dexCap;

    private Integer checkPenalty;

    private Integer speedPenalty;

    private Integer strengthRequirement;

    private Double bulk;

    public Armor(String name, ArmorCategory category, ArmorGroup armorGroup, Integer acBonus, Integer dexCap, Integer checkPenalty, Integer speedPenalty, Double bulk){
        this.name = name;
        this.category = category;
        this.armorGroup = armorGroup;
        this.acBonus = acBonus;
        this.dexCap = dexCap;
        this.checkPenalty = checkPenalty;
        this.speedPenalty = speedPenalty;
        this.bulk = bulk;
    }
}
