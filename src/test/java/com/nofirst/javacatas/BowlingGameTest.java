package com.nofirst.javacatas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingGameTest {

    private final BowlingGame bowlingGame = new BowlingGame();

    @Test
    public void it_scores_a_gutter_game_as_zero()
    {
        for(int i=0;i < 20;i++)
        {
            this.bowlingGame.roll(0);
        }

        assertThat(this.bowlingGame.score()).isEqualTo(0);
    }

    /**
     * 统计所有被击倒的瓶子的分数。
     * 我们的测试思路是：如果每一次都只击倒了一个瓶子，那么会有 20 次 roll(1)，且总分为 20
     */
    @Test
    public void it_scores_the_sum_of_all_knocked_down_pins_for_a_game()
    {
        for(int i=0;i < 20;i++)
        {
            this.bowlingGame.roll(1);
        }

        assertThat(this.bowlingGame.score()).isEqualTo(20);
    }

    /**
     * 接下来我们要来测试 补中，即 Spare。
     * 假设我们第一轮完成了 Spare（共计投了两次球），
     * 然后剩下的掷球回合击倒数分别为 5 和 17 次 0 击倒，
     * 所以总分为：（10 + 5）+ 5 = 20
     */
    @Test
    public void it_awards_a_roll_bonus_for_every_spare()
    {
        this.bowlingGame.roll(2);
        this.bowlingGame.roll(8); // 补中

        this.bowlingGame.roll(5);

        for(int i=0;i < 17;i++)
        {
            this.bowlingGame.roll(0);
        }

        assertThat(this.bowlingGame.score()).isEqualTo(20);
    }
}
