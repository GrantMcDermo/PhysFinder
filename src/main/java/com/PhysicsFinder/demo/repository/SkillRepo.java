package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SkillRepo extends JpaRepository<Skill, UUID> {
    Optional<Skill> findByName(String name);
}
