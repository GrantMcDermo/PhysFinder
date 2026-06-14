package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Trait;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TraitRepo extends JpaRepository<Trait, UUID> {
    Optional<Trait> findByName(String name);
}
