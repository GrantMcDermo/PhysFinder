package com.PhysicsFinder.demo.services;

import com.PhysicsFinder.demo.DTO.GameActionResponse;
import com.PhysicsFinder.demo.entities.GameAction;
import com.PhysicsFinder.demo.entities.GameActionGrant;
import com.PhysicsFinder.demo.entities.PlayerCharacter;
import com.PhysicsFinder.demo.entities.ProficiencyCategory;
import com.PhysicsFinder.demo.repository.GameActionRepo;
import com.PhysicsFinder.demo.repository.PlayerCharacterRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CharacterActionService {

    private final PlayerCharacterRepo playerCharacterRepo;
    private final GameActionRepo gameActionRepo;

    public List<GameActionResponse> getAvailableActions(UUID characterId) {
        PlayerCharacter character = playerCharacterRepo.findById(characterId).orElseThrow(() -> new RuntimeException("Character not found"));
        return gameActionRepo.findAll().stream().filter(action -> characterQualifiesForAction(character, action)).map(this::toResponse).toList();
    }

    private boolean characterQualifiesForAction(PlayerCharacter character, GameAction action){
        if (action.getGrants().isEmpty())
            return true;
        return action.getGrants().stream()
                .anyMatch(grant -> characterQualifiesForGrant(character, grant));
    }

    private boolean characterQualifiesForGrant(PlayerCharacter character, GameActionGrant grant) {
        return switch (grant.getSourceType()) {
            case UNIVERSAL -> true;
            case CLASS -> character.getCharacterClass() != null
                    && grant.getCharacterClass() != null
                    && character.getCharacterClass().getId().equals(grant.getCharacterClass().getId());

            case FEAT -> character.getSelectedFeats().stream()
                    .anyMatch(selectedFeat ->
                            selectedFeat.getFeat().getId().equals(grant.getFeat().getId())
                    );

            case SKILL -> character.getProficiencies().stream()
                    .anyMatch(proficiency ->
                            proficiency.getCategory() == ProficiencyCategory.SKILL
                                    && proficiency.getProficiencyName().equals(grant.getSkill().getName())
                                    && proficiency.getRank().ordinal() >= grant.getRequiredSkillRank().ordinal()
                    );
            case HERITAGE -> character.getHeritage() != null
                    && grant.getHeritage() != null
                    && character.getHeritage().getId().equals(grant.getHeritage().getId());

            default -> false;
        };
    }

    private GameActionResponse toResponse(GameAction action){
        return new GameActionResponse(
                action.getId(),
                action.getName(),
                action.getActionType(),
                action.getSourceType(),
                action.getDescription()
        );
    }
}
