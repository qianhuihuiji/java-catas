package com.nofirst.javacatas;

public class TennisMatch {

    private Player playerOne;
    private Player playerTwo;

    public TennisMatch(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String score() {
        if (this.playerOne.getPoints() == 3 && this.playerTwo.getPoints() == 0) {
            return "Forty-Love";
        }
        if (this.playerOne.getPoints() == 2 && this.playerTwo.getPoints() == 0) {
            return "Thirty-Love";
        }
        if (this.playerOne.getPoints() == 1 && this.playerTwo.getPoints() == 0) {
            return "Fifteen-Love";
        }

        return "Love-All";
    }
}
