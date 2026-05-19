package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Ancestry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AncestryRepo extends JpaRepository<Ancestry, UUID> {
    Optional<Ancestry> findByName(String name);
}
