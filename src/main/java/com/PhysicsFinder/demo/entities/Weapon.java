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
public class Weapon {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private WeaponCategory category;

    @Enumerated(EnumType.STRING)
    private WeaponType weaponType;

    @Enumerated(EnumType.STRING)
    private WeaponGroup weaponGroup;

    private Integer damageDiceCount;

    private Integer damageDieSize;

    @Enumerated(EnumType.STRING)
    private DamageType damageType;

    private Double bulk;

    @Enumerated(EnumType.STRING)
    private HandUsageType handUsageType;

    private Integer handsRequiredToAttack;

    @ElementCollection
    private Set<WeaponTraitEntry> traits = new HashSet<>();

    private Integer rangeFeet;

    private Integer reloadActions;

    private String ammunition;

    public Weapon(String name, WeaponCategory category, WeaponType weaponType, WeaponGroup weaponGroup, Integer damageDiceCount, Integer damageDieSize, DamageType damageType){
        this.name = name;
        this.category = category;
        this.weaponType = weaponType;
        this.weaponGroup = weaponGroup;
        this.damageDiceCount = damageDiceCount;
        this.damageDieSize = damageDieSize;
        this.damageType = damageType;
    }
}
