package com.online.world.homeworld.controller;

import com.online.world.homeworld.charactservice.CreateCharacterSevice;
import com.online.world.homeworld.model.character.Player;
import lombok.AllArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
@AllArgsConstructor
class CreateCharacterController {

    private final CreateCharacterSevice createCharacterSevice;

    @GetMapping("player-generation")
    public RequestEntity<Player> generateRandomPlayerStats() {
        return null;
    }
}
