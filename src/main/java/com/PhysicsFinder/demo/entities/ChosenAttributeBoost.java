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
public class ChosenAttributeBoost {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    private PlayerCharacter playerCharacter;

    @Enumerated(EnumType.STRING)
    private AttributeName attributeName;

    private String source;
    // Example: ANCESTRY, BACKGROUND, CLASS, FREE
}
