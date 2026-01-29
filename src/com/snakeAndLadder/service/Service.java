package com.snakeAndLadder.service;

import java.util.Random;

import com.snakeAndLadder.constants.GameConstants;
import com.snakeAndLadder.model.Player;
import com.snakeAndLadder.util.DiceUtil;

public class Service {

    private final Random random = new Random();
    private static final int WINNING_POSITION = 100;
     
    public void playTurn(Player player){
        
       int diceValue = DiceUtil.rollDice();
        System.out.println("Dice rolled: " + diceValue);

        int option = random.nextInt(3); // 0–2
        String optionName = "";

        switch (option) {
            case GameConstants.NO_PLAY:
                optionName = "No Play";
                // position unchanged
                break;

            case GameConstants.LADDER:
                optionName = "Ladder";
                int tempPosLadder = player.getPosition() + diceValue;
                if(tempPosLadder <= WINNING_POSITION){
                    player.setPosition(tempPosLadder);
                }
                break;

            case GameConstants.SNAKE:
                optionName = "Snake";
                int tempPosSnake = player.getPosition() - diceValue;
                if(tempPosSnake < 0){
                    tempPosSnake = 0;
                }
                player.setPosition(tempPosSnake);
                break;
        }

        System.out.println("Option: " + optionName);
        System.out.println("Player new position: " + player.getPosition());
    }

    public boolean hasPlayerWon(Player player){
        return player.getPosition() == WINNING_POSITION;
    }
}
