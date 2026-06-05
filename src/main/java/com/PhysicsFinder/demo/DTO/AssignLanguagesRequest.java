package com.PhysicsFinder.demo.DTO;

import java.util.List;
import java.util.UUID;

public record AssignLanguagesRequest(List<UUID> chosenAdditionalLanguageIds) {
}
