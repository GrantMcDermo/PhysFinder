package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CharacterProficiency {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    private PlayerCharacter playerCharacter;

    private String proficiencyName;

    @Enumerated(EnumType.STRING)
    private ProficiencyCategory category;

    @Enumerated(EnumType.STRING)
    private ProficiencyRank rank;
}
