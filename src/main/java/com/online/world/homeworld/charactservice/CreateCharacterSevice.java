package com.online.world.homeworld.charactservice;

import com.online.world.homeworld.repo.PlayerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class CreateCharacterSevice {

    private final PlayerRepository playerRepository;

}
