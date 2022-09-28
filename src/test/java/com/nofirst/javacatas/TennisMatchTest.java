package com.nofirst.javacatas;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisMatchTest {

    private Player playerOne;
    private Player playerTwo;

    private TennisMatch tennisMatch;

    @BeforeEach
    public void setUp() {
        this.playerOne = new Player("john", 0);
        this.playerTwo = new Player("jane", 0);

        this.tennisMatch = new TennisMatch(playerOne, playerTwo);
    }

    @Test
    public void it_scores_a_scoreless_game()
    {
        assertThat(this.tennisMatch.score()).isEqualTo("Love-All");
    }

    @Test
    public void it_scores_a_1_0_game()
    {
        this.playerOne.earnPoints(1);
        assertThat(this.tennisMatch.score()).isEqualTo("Fifteen-All");
    }

}
