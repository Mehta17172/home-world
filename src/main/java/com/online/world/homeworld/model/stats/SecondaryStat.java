package com.online.world.homeworld.model.stats;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Model for the secondary Stat
 */
@Data
@Embeddable
public class SecondaryStat {

    private BigDecimal presence;
    private BigDecimal clarity;
    private BigDecimal hearing;
    private BigDecimal mass;

    public SecondaryStat() {
        this.presence = BigDecimal.valueOf(100);
        this.clarity = BigDecimal.valueOf(100);
        this.hearing = BigDecimal.valueOf(100);
        this.mass = BigDecimal.valueOf(100);
    }

    @Builder
    public SecondaryStat(BigDecimal presence, BigDecimal clarity, BigDecimal hearing, BigDecimal mass) {
        this.presence = presence;
        this.clarity = clarity;
        this.hearing = hearing;
        this.mass = mass;
    }
}
