package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface WeaponRepo extends JpaRepository<Weapon, UUID> {
    Optional<Weapon> findByName(String name);
}
