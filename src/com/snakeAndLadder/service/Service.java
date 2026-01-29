package com.snakeAndLadder.service;

import java.util.Random;

import com.snakeAndLadder.constants.GameConstants;
import com.snakeAndLadder.model.Player;
import com.snakeAndLadder.util.DiceUtil;

public class Service {

     private final Random random = new Random();
     
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
                player.setPosition(player.getPosition() + diceValue);
                break;

            case GameConstants.SNAKE:
                optionName = "Snake";
                player.setPosition(player.getPosition() - diceValue);
                break;
        }

        System.out.println("Option: " + optionName);
        System.out.println("Player new position: " + player.getPosition());
    }
}
