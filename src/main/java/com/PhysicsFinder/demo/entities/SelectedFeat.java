package com.PhysicsFinder.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class SelectedFeat {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    private PlayerCharacter playerCharacter;

    @ManyToOne(optional = false)
    private Feat feat;
}
