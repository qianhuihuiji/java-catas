package com.nofirst.javacatas;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    private List<Integer> rolls = new ArrayList<>();

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
        return this.rolls.stream().reduce(Integer::sum).orElse(0);
    }
}
