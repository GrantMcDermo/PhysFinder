package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Background;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BackgroundRepo extends JpaRepository<Background, UUID> {
    Optional<Background> findByName(String name);
}
