package com.online.world.homeworld.model.stats;

import jakarta.persistence.Embeddable;
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
        this.health = BigDecimal.valueOf(10);
        this.stamina = BigDecimal.valueOf(10);
        this.movementSpeed = BigDecimal.valueOf(10);
        this.vision = BigDecimal.valueOf(10);
        this.detection = BigDecimal.valueOf(10);
        this.encumbrance = BigDecimal.valueOf(10);
        this.carryingCapacity = BigDecimal.valueOf(100);
        this.panicRating = BigDecimal.valueOf(10);
    }

}
