package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Deity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface DeityRepo extends JpaRepository<Deity, UUID> {
    Optional<Deity> findByName(String name);
}
