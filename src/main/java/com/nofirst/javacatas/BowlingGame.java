package com.nofirst.javacatas;

public class BowlingGame {

    private int score = 0;

    /**
     *
     * 数表示被击倒的瓶子数，如 roll(0) 表示击倒了 0 个瓶子
     *
     * @param roll 击倒的瓶子数
     */
    public void roll(int roll)
    {
        this.score += roll;
    }

    public int score() {
        return this.score;
    }
}
