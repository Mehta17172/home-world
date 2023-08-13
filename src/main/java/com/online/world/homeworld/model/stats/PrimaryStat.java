package com.online.world.homeworld.model.stats;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Model for the primary Stat
 */
@Data
@Embeddable
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

    public PrimaryStat() {
        this.strength = BigDecimal.valueOf(10);
        this.agility = BigDecimal.valueOf(10);
        this.dexterity = BigDecimal.valueOf(10);
        this.vitality = BigDecimal.valueOf(100);
        this.endurance = BigDecimal.valueOf(10);
        this.attunement = BigDecimal.valueOf(10);
        this.will = BigDecimal.valueOf(10);
        this.faith = BigDecimal.valueOf(10);
        this.resonance = BigDecimal.valueOf(10);
        this.eyesight = BigDecimal.valueOf(10);
    }

}
