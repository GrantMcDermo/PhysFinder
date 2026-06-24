package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Spell;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SpellRepo extends JpaRepository<Spell, UUID> {
    Optional<Spell> findByName(String name);
}
