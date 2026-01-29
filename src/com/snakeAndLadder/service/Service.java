package com.snakeAndLadder.service;

import java.util.Random;

import com.snakeAndLadder.constants.GameConstants;
import com.snakeAndLadder.model.Player;
import com.snakeAndLadder.util.DiceUtil;

public class Service {

    private final Random random = new Random();
    private static final int WINNING_POSITION = 100;
     
    public boolean playTurn(Player player){
        
       int diceValue = DiceUtil.rollDice();
       player.increamentDiceRollCount();

       System.out.println(player.getName() +" has Dice rolled is: " + diceValue + " (Roll #" + player.getDiceRollCount() + ")");

        int option = random.nextInt(3); // 0–2
        String optionName = "";

        switch (option) {
            case GameConstants.NO_PLAY:
                optionName = "No Play";
                // position unchanged
                System.out.println(optionName);
                return false;

            case GameConstants.LADDER:
                optionName = "Ladder";
                int tempPosLadder = player.getPosition() + diceValue;
                if(tempPosLadder <= WINNING_POSITION){
                    player.setPosition(tempPosLadder);
                }
                System.out.println("Ladder");
                return true;

            case GameConstants.SNAKE:
                optionName = "Snake";
                int tempPosSnake = player.getPosition() - diceValue;
                if(tempPosSnake < 0){
                    tempPosSnake = 0;
                }
                player.setPosition(tempPosSnake);
                System.out.println("Snake");
                return false;
        }
        return false;

    }

    public boolean hasPlayerWon(Player player){
        return player.getPosition() == WINNING_POSITION;
    }
}
