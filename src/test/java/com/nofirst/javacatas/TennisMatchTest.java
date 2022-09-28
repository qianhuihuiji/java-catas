package com.nofirst.javacatas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisMatchTest {

    private final TennisMatch tennisMatch = new TennisMatch();

    @Test
    public void it_scores_a_scoreless_game()
    {
        assertThat(this.tennisMatch.score()).isEqualTo("Love-All");
    }

}
