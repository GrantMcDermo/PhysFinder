package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.CharacterClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CharacterClassRepo extends JpaRepository<CharacterClass, UUID> {
    Optional<CharacterClass> findByName(String name);
}
