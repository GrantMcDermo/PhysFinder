package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.ClassFeatureChoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ClassFeatureChoiceRepo extends JpaRepository<ClassFeatureChoice, UUID> {

    List<ClassFeatureChoice> findByCharacterClassId(UUID characterClassId);

    List<ClassFeatureChoice> findByCharacterClassIdAndFeatureName(
            UUID characterClassId,
            String featureName
    );
}
