package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.PlayerCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlayerCharacterRepo extends JpaRepository<PlayerCharacter, UUID> {
}
