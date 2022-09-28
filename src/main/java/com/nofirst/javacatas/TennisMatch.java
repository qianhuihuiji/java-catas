package com.nofirst.javacatas;

import java.util.HashMap;
import java.util.Map;

public class TennisMatch {

    private static final Map<Integer, String> LOOKUP = new HashMap<>() {};

    static {
        LOOKUP.put(0, "Love");
        LOOKUP.put(1, "Fifteen");
        LOOKUP.put(2, "Thirty");
        LOOKUP.put(3, "Forty");
    }

    private Player playerOne;
    private Player playerTwo;

    public TennisMatch(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String score() {
        if (this.hasWinner()) {
            return "Win For " + this.leader().getName();
        }
        if (this.hasTheAdvantage()) {
            return "Advantage " + this.leader().getName();
        }

        String result =  LOOKUP.get(this.playerOne.getPoints()) + "-";
        result += this.tied() ? "All" :  LOOKUP.get(this.playerTwo.getPoints());

        return result;
    }

    private boolean hasTheAdvantage() {
        return hasEnoughPointsToBeWon() && isLeadingByOne();
    }

    private Player leader() {
        return this.playerOne.getPoints() > this.playerTwo.getPoints() ? playerOne : playerTwo;
    }

    private boolean hasWinner() {
        return hasEnoughPointsToBeWon() && isLeadingAtLeastByTwo();
    }

    private boolean isLeadingAtLeastByTwo() {
        return Math.abs(this.playerOne.getPoints() - this.playerTwo.getPoints()) >= 2;
    }

    private boolean isLeadingByOne() {
        return Math.abs(this.playerOne.getPoints() - this.playerTwo.getPoints()) == 1;
    }

    private boolean hasEnoughPointsToBeWon() {
        return Math.max(this.playerOne.getPoints(), this.playerTwo.getPoints()) >= 4;
    }

    private boolean tied() {
        return this.playerOne.getPoints().equals(this.playerTwo.getPoints());
    }
}
