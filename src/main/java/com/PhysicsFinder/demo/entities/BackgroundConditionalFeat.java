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
public class BackgroundConditionalFeat {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    private Background background;

    @ManyToOne(optional = false)
    private Skill requiredSkill;

    @ManyToOne(optional = false)
    private Feat feat;

    public BackgroundConditionalFeat(Background background, Skill requiredSkill, Feat feat){
        this.background = background;
        this.requiredSkill = requiredSkill;
        this.feat = feat;
    }
}