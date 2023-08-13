package com.online.world.homeworld.repo;

import com.online.world.homeworld.model.character.Player;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PlayerRepository extends PagingAndSortingRepository<Player, String> {
}
