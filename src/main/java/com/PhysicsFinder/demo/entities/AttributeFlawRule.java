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
public class AttributeFlawRule {

    @Id
    @GeneratedValue
    private UUID id;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AttributeName> attributeOptions = new ArrayList<>();

    private Integer numberToChoose = 1;

    @ManyToOne
    private Ancestry ancestry;
}
