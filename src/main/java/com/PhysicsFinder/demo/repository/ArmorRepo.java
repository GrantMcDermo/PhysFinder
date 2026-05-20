package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Armor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ArmorRepo extends JpaRepository<Armor, UUID> {
    Optional<Armor> findByName(String name);
}
