package com.online.world.homeworld.repo;

import com.online.world.homeworld.model.LevelModel;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface LevelModelRepository extends CrudRepository<LevelModel, BigDecimal> {
}
