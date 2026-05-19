package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.AttributeBoostRule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AttributeBoostRuleRepo extends JpaRepository<AttributeBoostRule, UUID> {
    List<AttributeBoostRule> findByAncestryId(UUID ancestryId);

    List<AttributeBoostRule> findByBackgroundId(UUID backgroundId);

    List<AttributeBoostRule> findByCharacterClassId(UUID characterClassId);

    List<AttributeBoostRule> findByClassFeatureChoiceId(UUID classFeatureChoiceId);
}
