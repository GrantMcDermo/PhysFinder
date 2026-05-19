package com.PhysicsFinder.demo.controllers;

import com.PhysicsFinder.demo.entities.*;
import com.PhysicsFinder.demo.repository.*;
import com.PhysicsFinder.demo.services.CharacterCreationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/options")
@RequiredArgsConstructor
public class OptionsController {

    private final AncestryRepo ancestryRepo;
    private final HeritageRepo heritageRepo;
    private final FeatRepo featRepo;
    private final CharacterClassRepo characterClassRepo;
    private final BackgroundRepo backgroundRepo;
    private final SkillRepo skillRepo;
    private CharacterCreationService characterCreationService;

    @GetMapping("/ancestries")
    public List<Ancestry> getAncestries() {
        return ancestryRepo.findAll();
    }

    @GetMapping("/ancestries/{ancestryId}/heritages")
    public List<Heritage> getHeritagesForAncestry(@PathVariable UUID ancestryId) {
        return heritageRepo.findByAncestryIdOrHeritageType(
                ancestryId,
                HeritageType.VERSATILE
        );
    }

    @GetMapping("/backgrounds")
    public List<Background> getBackgrounds() {
        return backgroundRepo.findAll();
    }

    @GetMapping("/classes")
    public List<CharacterClass> getClasses() {
        return characterClassRepo.findAll();
    }

    @GetMapping("/skills")
    public List<Skill> getSkills() {
        return skillRepo.findAll();
    }

    @GetMapping("/feats")
    public List<Feat> getFeats() {
        return featRepo.findAll();
    }

    @GetMapping("/characters/{characterId}/ancestry-feats")
    public List<Feat> getAvailableAncestryFeats(@PathVariable UUID characterId) {
        return characterCreationService.getAvailableAncestryFeats(characterId);
    }
}
