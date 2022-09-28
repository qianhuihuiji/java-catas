package com.nofirst.javacatas;

public class TennisMatch {

    private Player playerOne;
    private Player playerTwo;

    public TennisMatch(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String score() {
        if (this.playerOne.getPoints() == 1 && this.playerTwo.getPoints() == 0) {
            return "Fifteen-All";
        }

        return "Love-All";
    }
}
