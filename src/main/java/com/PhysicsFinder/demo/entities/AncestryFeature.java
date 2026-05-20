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
public class AncestryFeature {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    private Ancestry ancestry;

    private String name;

    @Column(length = 3000)
    private String description;
}
