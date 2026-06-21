package com.PhysicsFinder.demo.DTO;

import java.util.UUID;

public record AssignDeityRequest(UUID deityId, UUID chosenDeitySkillId, UUID chosenDeityWeaponId) {
}