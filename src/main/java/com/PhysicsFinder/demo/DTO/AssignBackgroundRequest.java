package com.PhysicsFinder.demo.DTO;

import java.util.UUID;

public record AssignBackgroundRequest(UUID backgroundId, UUID chosenBackgroundSkillId) {
}
