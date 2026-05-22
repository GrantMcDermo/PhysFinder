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
public class GameAction {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private ActionType actionType;

    @Enumerated(EnumType.STRING)
    private ActionSourceType sourceType;

    @Column(length = 3000)
    private String description;

    @OneToMany(mappedBy = "gameAction", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GameActionGrant> grants = new ArrayList<>();

    public GameAction(String name, ActionType actionType, String description){
        this.name = name;
        this.actionType = actionType;
        this.sourceType = sourceType;
        this.description = description;
    }
}
