package com.nofirst.javacatas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingGameTest {

    private final BowlingGame bowlingGame = new BowlingGame();

    @Test
    public void it_scores_a_gutter_game_as_zero()
    {
        rollTimes(20, 0);

        assertThat(this.bowlingGame.score()).isEqualTo(0);
    }

    /**
     * 统计所有被击倒的瓶子的分数。
     * 我们的测试思路是：如果每一次都只击倒了一个瓶子，那么会有 20 次 roll(1)，且总分为 20
     */
    @Test
    public void it_scores_the_sum_of_all_knocked_down_pins_for_a_game()
    {
        rollTimes(20, 1);

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
        this.rollSpare(); // 补中

        this.bowlingGame.roll(5);

        rollTimes(17, 0);

        assertThat(this.bowlingGame.score()).isEqualTo(20);
    }

    /**
     * 下一个测试：测试 全中，即 Strike
     */
    @Test
    public void it_awards_a_two_roll_bonus_for_every_strike()
    {
        this.bowlingGame.roll(10);// 全中

        this.bowlingGame.roll(7);
        this.bowlingGame.roll(2);

        rollTimes(17, 0);

        assertThat(this.bowlingGame.score()).isEqualTo(28);
    }

    /**
     * 最后一个测试：满分局。这种情况的出现表明你连续获得了 10 次 strike，所以最终会得到 300 分：
     */
    @Test
    public void it_scores_a_perfect_game()
    {
        rollTimes(12, 10);

        assertThat(this.bowlingGame.score()).isEqualTo(300);
    }

    private void rollSpare()
    {
        this.bowlingGame.roll(2);
        this.bowlingGame.roll(8);
    }

    private void rollTimes(int times, int pints) {
        for(int i=0;i < times;i++)
        {
            this.bowlingGame.roll(pints);
        }
    }
}
