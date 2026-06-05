package com.PhysicsFinder.demo.controllers;

import com.PhysicsFinder.demo.DTO.*;
import com.PhysicsFinder.demo.entities.PlayerCharacter;
import com.PhysicsFinder.demo.services.CharacterCreationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/characters")
@RequiredArgsConstructor
public class PlayerCharacterController {

    private final CharacterCreationService characterCreationService;

    @PostMapping
    public ResponseEntity<PlayerCharacter> createCharacter(@RequestBody CreateCharacterRequest request){
        PlayerCharacter playerCharacter = characterCreationService.createBlankCharacter(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(playerCharacter);
    }

    @PatchMapping("/{characterId}/ancestry")
    public ResponseEntity<PlayerCharacter> assignAncestry(@PathVariable UUID characterId, @RequestBody AssignAncestryRequest request){
        PlayerCharacter updated = characterCreationService.assignAncestry(characterId, request);
        return ResponseEntity.ok(updated);
    }

    @PatchMapping("/{characterId}/languages")
    public ResponseEntity<PlayerCharacter> assignLanguages(@PathVariable UUID characterId, @RequestBody AssignLanguagesRequest request){
        return ResponseEntity.ok(characterCreationService.assignAdditionalLanguages(characterId, request));
    }

    @PatchMapping("/{characterId}/heritage")
    public ResponseEntity<PlayerCharacter> assignHeritage(
            @PathVariable UUID characterId,
            @RequestBody AssignHeritageRequest request
    ) {
        return ResponseEntity.ok(
                characterCreationService.assignHeritage(characterId, request)
        );
    }

    @PatchMapping("/{characterId}/background")
    public ResponseEntity<PlayerCharacter> assignBackground(
            @PathVariable UUID characterId,
            @RequestBody AssignBackgroundRequest request
    ) {
        return ResponseEntity.ok(
                characterCreationService.assignBackground(characterId, request)
        );
    }

    @PatchMapping("/{characterId}/class")
    public ResponseEntity<PlayerCharacter> assignClass(
            @PathVariable UUID characterId,
            @RequestBody AssignClassRequest request
    ) {
        return ResponseEntity.ok(
                characterCreationService.assignClass(characterId, request)
        );
    }

    @PostMapping("/{characterId}/feats")
    public ResponseEntity<PlayerCharacter> selectFeat(
            @PathVariable UUID characterId,
            @RequestBody SelectFeatRequest request
    ) {
        return ResponseEntity.ok(
                characterCreationService.selectFeat(characterId, request)
        );
    }

    @PatchMapping("/{characterId}/attributes")
    public ResponseEntity<PlayerCharacter> applyAttributeBoosts(
            @PathVariable UUID characterId,
            @RequestBody ApplyAttributeBoostRequest request
    ) {
        return ResponseEntity.ok(
                characterCreationService.applyAttributeBoosts(characterId, request)
        );
    }

    @PatchMapping("/{characterId}/additional-skills")
    public ResponseEntity<PlayerCharacter> assignAdditionalSkills(
            @PathVariable UUID characterId,
            @RequestBody AssignAdditionalSkillsRequest request
    ) {
        return ResponseEntity.ok(
                characterCreationService.assignAdditionalSkills(characterId, request)
        );
    }
}
