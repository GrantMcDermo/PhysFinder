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
public class Deity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany
    private List<Weapon> favoredWeaponOptions = new ArrayList<>();

    @ManyToMany
    private List<Skill> grantedSkillOptions = new ArrayList<>();

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AttributeName> divineAttributes = new ArrayList<>();

    private Set<Spell> divineFonts = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private SanctificationType sanctificationType;

    @ManyToMany
    private Set<Trait> sanctificationTraits = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "deity_cleric_spells", joinColumns = @JoinColumn(name = "deity_id"), inverseJoinColumns = @JoinColumn(name = "spell_id"))
    private List<Spell> clericSpells =  new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "deity_domain", joinColumns = @JoinColumn(name = "deity_id"), inverseJoinColumns = @JoinColumn(name = "domain_id"))
    private Set<Domain> mainDomains = new HashSet<>();

    public Deity(String name, List<Weapon> favoredWeaponOptions, List<Skill> grantedSkillOptions, List<AttributeName> divineAttributes, Set<Spell> divineFonts, SanctificationType sanctificationType) {
        this.name = name;
        this.favoredWeaponOptions = favoredWeaponOptions;
        this.grantedSkillOptions = grantedSkillOptions;
        this.divineAttributes = divineAttributes;
        this.divineFonts = divineFonts;
        this.sanctificationType = sanctificationType;
    }
}
