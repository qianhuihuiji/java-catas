package com.nofirst.javacatas;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    private final List<Integer> rolls = new ArrayList<>();

    /**
     *
     * 数表示被击倒的瓶子数，如 roll(0) 表示击倒了 0 个瓶子
     *
     * @param pints 击倒的瓶子数
     */
    public void roll(int pints)
    {
        this.rolls.add(pints);
    }

    public int score() {
        int score = 0;
        int roll = 0;

        for(int frame = 1;frame <= 10;frame++)
        {
            if(this.rolls.get(roll) + this.rolls.get(roll+1) == 10) {
                score += 10;

                score += this.rolls.get(roll+2);
            } else {
                score += this.rolls.get(roll) + this.rolls.get(roll+1);
            }

            roll += 2;
        }

        return score;
    }
}
