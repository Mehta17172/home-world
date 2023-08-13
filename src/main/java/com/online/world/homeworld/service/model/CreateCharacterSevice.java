package com.online.world.homeworld.service.model;

import com.online.world.homeworld.constants.Constants;
import com.online.world.homeworld.model.character.PlayerModel;
import com.online.world.homeworld.model.level.PlayerLevel;
import com.online.world.homeworld.model.stats.DerivedStat;
import com.online.world.homeworld.model.stats.PrimaryStat;
import com.online.world.homeworld.model.stats.SecondaryStat;
import com.online.world.homeworld.repo.PlayerRepository;
import com.online.world.homeworld.utils.RandomUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@AllArgsConstructor
public class CreateCharacterSevice {

    private final PlayerRepository playerRepository;

    public PlayerModel createRandomPlayer() {
        PlayerModel player = new PlayerModel();
        player.setPlayerId(UUID.randomUUID().toString());
        player.setPlayerName(RandomUtils.generateRandomString(Constants.RANDOM_STRING_VALUE) + RandomUtils.generateRandomNumber(0 ,Constants.RANDOM_NUM_VALUE));
        player.setPrimaryStat(generatePrimaryStat());
        player.setSecondaryStat(generateSecondaryStat());
        player.setDerivedStat(generateDerivedStat());
        player.setPlayerLevel(generateRandomPlayerLevel());
        playerRepository.save(player);
        return player;
    }

    public List<PlayerModel> createNNumberRandomPlayers(int numberOfPlayers) {
        List<PlayerModel> playerModels = new ArrayList<>();
        int count = 0;
        while(count != numberOfPlayers) {
            count++;
            PlayerModel player = createRandomPlayer();
            playerModels.add(player);
        }
        playerRepository.saveAll(playerModels);
        return playerModels;
    }

    private PlayerLevel generateRandomPlayerLevel() {
        return PlayerLevel.builder()
                .currentLevel(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(50)))
                .currentExperience(BigDecimal.ZERO)
                .tier(getRandomNumberValue(BigDecimal.ZERO, BigDecimal.TEN))
                .build();
    }

    private DerivedStat generateDerivedStat() {
        return DerivedStat.builder()
                .health(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .stamina(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .movementSpeed(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .vision(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .detection(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .encumbrance(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .carryingCapacity(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .panicRating(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .build();
    }

    private SecondaryStat generateSecondaryStat() {
        return SecondaryStat.builder()
                .presence(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .clarity(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .hearing(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .mass(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .build();
    }

    private PrimaryStat generatePrimaryStat() {
        return PrimaryStat.builder()
                .strength(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .agility(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .dexterity(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .vitality(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .endurance(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .attunement(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .will(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .faith(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .resonance(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .eyesight(getRandomNumberValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .build();
    }

    private BigDecimal getRandomNumberValue(BigDecimal start, BigDecimal end) {
        return RandomUtils.generateBigDecimalRandomNumber(start, end);
    }
}
