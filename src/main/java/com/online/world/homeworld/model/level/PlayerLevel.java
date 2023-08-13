package com.online.world.homeworld.model.level;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * POJO for players level
 */
@Embeddable
@Data
public class PlayerLevel {

    private BigDecimal currentLevel;
    private BigDecimal currentExperience;
    private BigDecimal tier;

    public PlayerLevel() {
        this.currentLevel = BigDecimal.ONE;
        this.currentExperience = BigDecimal.ZERO;
        this.tier = BigDecimal.ZERO;
    }
    @Builder
    public PlayerLevel(BigDecimal currentLevel, BigDecimal currentExperience, BigDecimal tier) {
        this.currentLevel = currentLevel;
        this.currentExperience = currentExperience;
        this.tier = tier;
    }
}
