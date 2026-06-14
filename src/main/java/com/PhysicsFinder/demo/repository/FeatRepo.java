package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.Feat;
import com.PhysicsFinder.demo.entities.FeatType;
import com.PhysicsFinder.demo.entities.Trait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface FeatRepo extends JpaRepository<Feat, UUID> {
    List<Feat> findByFeatType(FeatType featType);
    List<Feat> findByAvailableToClassesId(UUID classId);

    List<Feat> findByAncestryId(UUID ancestryId);

    List<Feat> findByHeritageId(UUID heritageId);

    List<Feat> findByAncestryIdIn(List<UUID> ancestryIds);

    List<Feat> findByHeritageIdAndFeatType(UUID heritageId, FeatType featType);

    List<Feat> findByFeatTypeAndLevelLessThanEqual(FeatType featType, Integer level);

    @Query("SELECT DISTINCT f FROM Feat f JOIN f.traits t WHERE t IN :traits AND f.level <= :level")
    List<Feat> findDistinctByTraitsInAndLevelLessThanEqual(@Param("traits") Collection<Trait> traits, @Param("level") Integer level);
}
