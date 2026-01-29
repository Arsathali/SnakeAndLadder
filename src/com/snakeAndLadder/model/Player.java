package com.snakeAndLadder.model;

public class Player {
    
    private int position;
    private int diceRollCount;
    private String name;

    public Player(String name){
        this.position = 0;
        this.diceRollCount = 0;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
