package com.PhysicsFinder.demo.repository;

import com.PhysicsFinder.demo.entities.ActionSourceType;
import com.PhysicsFinder.demo.entities.GameAction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GameActionRepo extends JpaRepository<GameAction, UUID> {
    List<GameAction> findBySourceType(ActionSourceType sourceType);
}
