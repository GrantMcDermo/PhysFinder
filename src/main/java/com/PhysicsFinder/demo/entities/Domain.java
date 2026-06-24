package com.PhysicsFinder.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false, name = "spell_id")
    private Spell domainSpell;

    @OneToOne(cascade = CascadeType.ALL)
    private Spell advancedDomainSpell;

    @ManyToMany(mappedBy = "domains")
    private Set<Deity> deities = new HashSet<>();

    public Domain(String name, String description, Spell domainSpell,  Spell advancedDomainSpell) {
        this.name = name;
        this.description = description;
        this.domainSpell = domainSpell;
        this.advancedDomainSpell = advancedDomainSpell;
    }
}
