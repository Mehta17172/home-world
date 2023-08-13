package com.online.world.homeworld.service.model;

import com.online.world.homeworld.model.LevelModel;
import com.online.world.homeworld.repo.LevelModelRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class LevelModelService {

    private final LevelModelRepository levelModelRepository;

    public List<LevelModel> creteLevelModel(int levelCap) {
        List<LevelModel> levelModels = new ArrayList<>();
        int count = 0;
        int tier = 0;
        while(count != levelCap) {
            count++;
            tier = (count % 10 == 0) ? count/10 : tier;
            LevelModel levelModel = LevelModel.builder()
                    .level(BigDecimal.valueOf(count))
                    .experienceNeeded(BigDecimal.valueOf(count * 1000L))
                    .tier(BigDecimal.valueOf(tier))
                    .build();
            levelModels.add(levelModel);
        }
        levelModelRepository.saveAll(levelModels);
        return levelModels;
    }
}
