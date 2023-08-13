package com.online.world.homeworld.controller;

import com.online.world.homeworld.model.LevelModel;
import com.online.world.homeworld.model.character.PlayerModel;
import com.online.world.homeworld.service.model.CreateCharacterSevice;
import com.online.world.homeworld.service.model.LevelModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeWorldModelCreationController {

    private final CreateCharacterSevice createCharacterSevice;
    private final LevelModelService levelModelService;

    @Autowired
    public HomeWorldModelCreationController(CreateCharacterSevice createCharacterSevice, LevelModelService levelModelService) {
        this.createCharacterSevice = createCharacterSevice;
        this.levelModelService = levelModelService;
    }

    @GetMapping("/player-creation")
    public ResponseEntity<PlayerModel> getRandomPlayerStat() {
        return ResponseEntity.ok(createCharacterSevice.createRandomPlayer());
    }

    @GetMapping("/level-mode-cration")
    public ResponseEntity<List<LevelModel>> createLevelModels(@RequestParam("levelCap") int levelCap) {
        return ResponseEntity.ok(levelModelService.creteLevelModel(levelCap));
    }
}
