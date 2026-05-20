package com.PhysicsFinder.demo.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AttributeModifiers {
    private Integer strength = 0;
    private Integer dexterity = 0;
    private Integer constitution = 0;
    private Integer intelligence = 0;
    private Integer wisdom = 0;
    private Integer charisma = 0;

    public void increase(AttributeName attributeName) {
        switch (attributeName) {
            case STRENGTH -> strength++;
            case DEXTERITY -> dexterity++;
            case CONSTITUTION -> constitution++;
            case INTELLIGENCE -> intelligence++;
            case WISDOM -> wisdom++;
            case CHARISMA -> charisma++;
        }
    }

    public void decrease(AttributeName attributeName) {
        switch (attributeName) {
            case STRENGTH -> strength--;
            case DEXTERITY -> dexterity--;
            case CONSTITUTION -> constitution--;
            case INTELLIGENCE -> intelligence--;
            case WISDOM -> wisdom--;
            case CHARISMA -> charisma--;
        }
    }
}
