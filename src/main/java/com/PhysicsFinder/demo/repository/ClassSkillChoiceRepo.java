package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.ClassSkillChoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ClassSkillChoiceRepo extends JpaRepository<ClassSkillChoice, UUID> {
    List<ClassSkillChoice> findByCharacterClassId(UUID characterClassId);
}
