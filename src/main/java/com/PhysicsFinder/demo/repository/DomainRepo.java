package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface DomainRepo extends JpaRepository<Domain, UUID> {
    Optional<Domain> findByName(String name);
}
