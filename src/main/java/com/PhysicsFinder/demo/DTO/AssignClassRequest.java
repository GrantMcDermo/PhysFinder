package com.PhysicsFinder.demo.DTO;

import java.util.List;
import java.util.UUID;

public record AssignClassRequest(
        UUID characterClassId,
        List<UUID> selectedClassFeatureChoiceIds, List<UUID> chosenClassSkillIds, List<UUID> chosenFeatureSkillIds, List<UUID> chosenAdditionalSkillIds) {
}
