package com.snakeAndLadder.model;

public class Player {
    
    private int position;
    private int diceRollCount;

    public Player(){
        this.position = 0;
        this.diceRollCount = 0;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getDiceRollCount() {
        return diceRollCount;
    }
    public void increamentDiceRollCount(){
        this.diceRollCount++;
    }
}
