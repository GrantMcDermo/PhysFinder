package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface LanguageRepo extends JpaRepository<Language, UUID> {
    Optional<Language> findByName(String name);
}
