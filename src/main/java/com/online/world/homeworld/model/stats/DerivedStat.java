package com.online.world.homeworld.model.stats;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Model for the derived Stat
 */
@Data
@Embeddable
public class DerivedStat {

    private BigDecimal health;
    private BigDecimal stamina;
    private BigDecimal movementSpeed;
    private BigDecimal vision;
    private BigDecimal detection;
    private BigDecimal encumbrance;
    private BigDecimal carryingCapacity;
    private BigDecimal panicRating;

    public DerivedStat() {
        this.health = BigDecimal.valueOf(100);
        this.stamina = BigDecimal.valueOf(100);
        this.movementSpeed = BigDecimal.valueOf(100);
        this.vision = BigDecimal.valueOf(100);
        this.detection = BigDecimal.valueOf(100);
        this.encumbrance = BigDecimal.valueOf(100);
        this.carryingCapacity = BigDecimal.valueOf(100);
        this.panicRating = BigDecimal.valueOf(100);
    }

    @Builder
    public DerivedStat(BigDecimal health, BigDecimal stamina, BigDecimal movementSpeed, BigDecimal vision, BigDecimal detection, BigDecimal encumbrance, BigDecimal carryingCapacity, BigDecimal panicRating) {
        this.health = health;
        this.stamina = stamina;
        this.movementSpeed = movementSpeed;
        this.vision = vision;
        this.detection = detection;
        this.encumbrance = encumbrance;
        this.carryingCapacity = carryingCapacity;
        this.panicRating = panicRating;
    }
}
