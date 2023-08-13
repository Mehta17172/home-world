package com.online.world.homeworld.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DerivedStat {

    private BigDecimal health;
    private BigDecimal stamina;
    private BigDecimal movementSpeed;
    private BigDecimal vision;
    private BigDecimal detection;
    private BigDecimal encumbrance;
    private BigDecimal carryingCapacity;
    private BigDecimal panicRating;

}
