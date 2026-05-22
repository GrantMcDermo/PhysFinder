package com.PhysicsFinder.demo.DTO;

import com.PhysicsFinder.demo.entities.ActionSourceType;
import com.PhysicsFinder.demo.entities.ActionType;

import java.util.UUID;

public record GameActionResponse(UUID id,
                                 String name,
                                 ActionType actionType,
                                 ActionSourceType sourceType,
                                 String description) {
}
