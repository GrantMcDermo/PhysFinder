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
public class InitialProficiency {
    private String proficiencyName;

    @Enumerated(EnumType.STRING)
    private ProficiencyCategory proficiencyCategory;

    @Enumerated(EnumType.STRING)
    private ProficiencyRank rank;
}
