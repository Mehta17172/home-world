package com.online.world.homeworld.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SecondaryStat {

    private BigDecimal presence;
    private BigDecimal clarity;
    private BigDecimal hearing;
    private BigDecimal mass;
}
