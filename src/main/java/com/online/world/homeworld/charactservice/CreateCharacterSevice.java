package com.online.world.homeworld.charactservice;

import com.online.world.homeworld.constants.Constants;
import com.online.world.homeworld.model.character.Player;
import com.online.world.homeworld.model.stats.DerivedStat;
import com.online.world.homeworld.model.stats.PrimaryStat;
import com.online.world.homeworld.model.stats.SecondaryStat;
import com.online.world.homeworld.repo.PlayerRepository;
import com.online.world.homeworld.utils.RandomUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
@Slf4j
@AllArgsConstructor
public class CreateCharacterSevice {

    private final PlayerRepository playerRepository;

    public Player createRandomPlayer() {
        Player player = new Player();
        player.setPlayerId(UUID.randomUUID().toString());
        player.setPlayerName(RandomUtils.generateRandomString(Constants.RANDOM_STRING_VALUE) + RandomUtils.generateRandomNumber(0 ,Constants.RANDOM_NUM_VALUE));
        player.setPrimaryStat(generatePrimaryStat());
        player.setSecondaryStat(generateSecondaryStat());
        player.setDerivedStat(generateDerivedStat());
        return player;
    }

    private DerivedStat generateDerivedStat() {
        return DerivedStat.builder()
                .health(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .stamina(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .movementSpeed(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .vision(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .detection(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .encumbrance(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .carryingCapacity(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .panicRating(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .build();
    }

    private SecondaryStat generateSecondaryStat() {
        return SecondaryStat.builder()
                .presence(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .clarity(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .hearing(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .mass(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .build();
    }

    private PrimaryStat generatePrimaryStat() {
        return PrimaryStat.builder()
                .strength(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .agility(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .dexterity(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .vitality(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .endurance(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .attunement(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .will(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .faith(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .resonance(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .eyesight(getRandomStatValue(BigDecimal.ONE, BigDecimal.valueOf(100)))
                .build();
    }

    private BigDecimal getRandomStatValue(BigDecimal start, BigDecimal end) {
        return RandomUtils.generateBigDecimalRandomNumber(start, end);
    }
}
