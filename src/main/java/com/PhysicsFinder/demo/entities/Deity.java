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

    public Deity(String name, List<Weapon> favoredWeaponOptions, List<Skill> grantedSkillOptions, List<AttributeName> divineAttributes) {
        this.name = name;
        this.favoredWeaponOptions = favoredWeaponOptions;
        this.grantedSkillOptions = grantedSkillOptions;
        this.divineAttributes = divineAttributes;
    }
}
