package com.online.world.homeworld.utils;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;


public class RandomUtils {

    private static Random random;  // SecureRandom is preferred to Random

    static {
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private RandomUtils() {}

    public static int generateRandomNumber(int start, int end) {

        // Generate a random number between 0 (inclusive) and n+1 (exclusive)
        return start + random.nextInt(end - start + 1);
    }

    public static BigDecimal generateBigDecimalRandomNumber(BigDecimal min, BigDecimal max) {
        int scale = 2; // Scale for decimal places
        RoundingMode roundingMode = RoundingMode.HALF_UP; // Rounding mode

        // Generate a random BigDecimal between min and max
        BigDecimal randomBigDecimal = min.add(new BigDecimal(String.valueOf(random.nextInt(max.subtract(min).add(BigDecimal.ONE).abs().intValue()))));
        randomBigDecimal = randomBigDecimal.setScale(scale, roundingMode);
        return randomBigDecimal;
    }

    public static String generateRandomString(int n) {

        // Define the characters you want to use
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Generate a random length between 1 and 4
        int length = random.nextInt(n) + 1;

        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            // Generate a random index to select a character
            int randomIndex = random.nextInt(characters.length());

            // Append the randomly selected character to the randomString
            randomString.append(characters.charAt(randomIndex));
        }

        return randomString.toString();
    }
}

