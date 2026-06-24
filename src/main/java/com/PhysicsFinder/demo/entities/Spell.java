package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Spell {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany
    private Set<Trait> traits = new HashSet<>();

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<SpellTraditions> spellTraditions = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private ActionType spellActionType;

    @Enumerated(EnumType.STRING)
    private SpellType spellType;

    private Integer spellRank;
    private Integer spellRange;
    private String spellTargets;
    private String spellDefense;
    private String spellDescription;
    private String spellDuration;
    private String spellTrigger;
    private Integer spellArea;
    private String spellAreaType;
    private String spellRequirement;
    private String spellCastUnits;
    private Integer spellCastAmount;

    @OneToOne(mappedBy = "spell", cascade = CascadeType.ALL)
    private Domain spellDomain;

    public Spell(String name, Integer spellRank, SpellType spellType, ActionType spellActionType, Set<Trait> traits, String spellDescription) {
        this.name = name;
        this.spellRank = spellRank;
        this.spellType = spellType;
        this.spellActionType = spellActionType;
        this.traits = traits;
        this.spellDescription = spellDescription;
    }


}
