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

}
