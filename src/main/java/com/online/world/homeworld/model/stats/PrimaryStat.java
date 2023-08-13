package com.online.world.homeworld.model.stats;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Model for the primary Stat
 */
@Embeddable
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

    public PrimaryStat() {
        this.strength = BigDecimal.valueOf(100);
        this.agility = BigDecimal.valueOf(100);
        this.dexterity = BigDecimal.valueOf(100);
        this.vitality = BigDecimal.valueOf(100);
        this.endurance = BigDecimal.valueOf(100);
        this.attunement = BigDecimal.valueOf(100);
        this.will = BigDecimal.valueOf(100);
        this.faith = BigDecimal.valueOf(100);
        this.resonance = BigDecimal.valueOf(100);
        this.eyesight = BigDecimal.valueOf(100);
    }

    @Builder
    public PrimaryStat(BigDecimal strength, BigDecimal agility, BigDecimal dexterity, BigDecimal vitality, BigDecimal endurance, BigDecimal attunement, BigDecimal will, BigDecimal faith, BigDecimal resonance, BigDecimal eyesight) {
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.vitality = vitality;
        this.endurance = endurance;
        this.attunement = attunement;
        this.will = will;
        this.faith = faith;
        this.resonance = resonance;
        this.eyesight = eyesight;
    }
}
