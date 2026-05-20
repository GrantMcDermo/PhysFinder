package com.PhysicsFinder.demo.DTO;

import java.util.List;
import java.util.UUID;

public record AssignClassRequest(UUID characterClassId, UUID deityId, List<UUID> selectedClassFeatureChoiceIds, List<UUID> chosenClassSkillIds, List<UUID> chosenFeatureSkillIds) {
}
