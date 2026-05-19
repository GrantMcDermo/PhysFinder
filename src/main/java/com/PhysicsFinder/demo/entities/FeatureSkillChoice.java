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
public class FeatureSkillChoice {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    private ClassFeatureChoice classFeatureChoice;

    @ManyToMany
    private List<Skill> skillOptions = new ArrayList<>();

    private Integer numberToChoose = 1;

    @Enumerated(EnumType.STRING)
    private ProficiencyRank rank = ProficiencyRank.TRAINED;
}
