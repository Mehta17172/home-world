package com.online.world.homeworld.controller;

import com.online.world.homeworld.charactservice.CreateCharacterSevice;
import com.online.world.homeworld.model.character.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateCharacterController {

    private final CreateCharacterSevice createCharacterSevice;

    @Autowired
    public CreateCharacterController(CreateCharacterSevice createCharacterSevice) {
        this.createCharacterSevice = createCharacterSevice;
    }

    @GetMapping("/player-generation")
    public ResponseEntity<Player> generateRandomPlayerStats() {
        return ResponseEntity.ok(createCharacterSevice.createRandomPlayer());
    }
}
