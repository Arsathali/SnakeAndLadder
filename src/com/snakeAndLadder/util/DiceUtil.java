package com.snakeAndLadder.util;

import java.util.Random;

public class DiceUtil {
    
    private static final Random random = new Random();

    //utility method
    public static int rollDice(){
       return random.nextInt(6) + 1;
    }
}
