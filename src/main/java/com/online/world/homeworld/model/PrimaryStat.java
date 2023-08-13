package com.online.world.homeworld.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * POJO for the primary Stat
 */
@Data
public class PrimaryStat {

    private BigDecimal strength;
    private BigDecimal agility;
    private BigDecimal dexterity;
    private BigDecimal vitality;
    private BigDecimal endurance;
    private BigDecimal attunement;
    private BigDecimal will;
    private BigDecimal faith;
    private BigDecimal resonance;
    private BigDecimal eyesight;

}
