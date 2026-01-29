package com.snakeAndLadder.service;

import java.util.Random;

import com.snakeAndLadder.model.Player;
import com.snakeAndLadder.util.DiceUtil;

public class Service {
    
    public void playTurn(Player player){
        
        int  diceValue = DiceUtil.rollDice();

        System.out.println("Dice rolled: " + diceValue);

        player.setPosition(player.getPosition() + diceValue);
        System.out.println("Player new position: "+player.getPosition());
    }
}
