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
public class ClassSkillChoice {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    private CharacterClass characterClass;

    @ManyToMany
    private List<Skill> skillOptions = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private ProficiencyRank rank = ProficiencyRank.TRAINED;

    private Integer numberToChoose = 1;

    public ClassSkillChoice(CharacterClass characterClass, List<Skill> skillOptions){
        this.characterClass = characterClass;
        this.skillOptions = skillOptions;
    }
}
