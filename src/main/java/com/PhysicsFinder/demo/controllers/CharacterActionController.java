package com.PhysicsFinder.demo.controllers;

import com.PhysicsFinder.demo.DTO.GameActionResponse;
import com.PhysicsFinder.demo.services.CharacterActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/characters")
@RequiredArgsConstructor
public class CharacterActionController {
    private final CharacterActionService characterActionService;

    @GetMapping("/{characterId}/actions")
    public ResponseEntity<List<GameActionResponse>> getAvailableActions(
            @PathVariable UUID characterId
    ) {
        return ResponseEntity.ok(
                characterActionService.getAvailableActions(characterId)
        );
    }
}
