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
public class GameActionGrant {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    private GameAction gameAction;

    @Enumerated(EnumType.STRING)
    private ActionSourceType sourceType;

    @ManyToOne
    private CharacterClass characterClass;

    @ManyToOne
    private Heritage heritage;

    @ManyToOne
    private Feat feat;

    @ManyToOne
    private Skill skill;

    @Enumerated(EnumType.STRING)
    private ProficiencyRank requiredSkillRank;

    public GameActionGrant(GameAction gameAction, ActionSourceType sourceType){
        this.gameAction = gameAction;
        this.sourceType = sourceType;
    }
}
