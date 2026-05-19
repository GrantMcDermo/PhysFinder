package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Heritage;
import com.PhysicsFinder.demo.entities.HeritageType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface HeritageRepo extends JpaRepository<Heritage, UUID> {
    List<Heritage> findByAncestryId(UUID ancestryId);
    List<Heritage> findByHeritageType(HeritageType heritageType);

    List<Heritage> findByAncestryIdOrHeritageType(UUID ancestryId, HeritageType heritageType);
}
