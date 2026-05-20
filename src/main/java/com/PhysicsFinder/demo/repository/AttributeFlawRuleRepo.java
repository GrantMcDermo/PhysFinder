package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.AttributeFlawRule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AttributeFlawRuleRepo extends JpaRepository<AttributeFlawRule, UUID> {
    List<AttributeFlawRule> findByAncestryId(UUID ancestryId);
}
