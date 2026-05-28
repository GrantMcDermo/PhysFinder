package com.PhysicsFinder.demo.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeaponTraitEntry {
    @Enumerated(EnumType.STRING)
    private WeaponTrait trait;

    @Enumerated(EnumType.STRING)
    private DamageType alternateDamageType; // for VERSATILE

    private Integer damageDieSize; // for DEADLY, FATAL or TWO_HAND

    private Integer rangeThresholdFeet; // for VOLLEY

}
