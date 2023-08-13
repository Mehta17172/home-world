package com.online.world.homeworld;

import com.online.world.homeworld.utils.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class TestClass {

    @BeforeEach
    public void beforeEach() {

    }

    @Test
    public void test() {
        System.out.println(RandomUtils.generateBigDecimalRandomNumber(BigDecimal.valueOf(10), BigDecimal.valueOf(50)));
    }
}
