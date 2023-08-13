package com.online.world.homeworld.repo;

import com.online.world.homeworld.model.character.PlayerModel;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<PlayerModel, String> {
}
