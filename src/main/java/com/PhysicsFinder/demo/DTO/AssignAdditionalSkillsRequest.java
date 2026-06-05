package com.PhysicsFinder.demo.DTO;

import java.util.List;
import java.util.UUID;

public record AssignAdditionalSkillsRequest(List<UUID> chosenAdditionalSkillIds) {
}
