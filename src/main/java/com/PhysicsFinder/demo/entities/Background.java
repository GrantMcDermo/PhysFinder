package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Background {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;
    @Column(length = 2000)
    private String description;

    @ManyToMany
    private List<Skill> trainedSkillOptions;
    private String loreSkill;

    @ManyToOne
    private Feat grantedSkillFeat;

    public Background(String name, String description, List<Skill> trainedSkillOptions, String loreSkill, Feat grantedSkillFeat) {
        this.name = name;
        this.description = description;
        this.trainedSkillOptions = trainedSkillOptions;
        this.loreSkill = loreSkill;
        this.grantedSkillFeat = grantedSkillFeat;
    }
}
