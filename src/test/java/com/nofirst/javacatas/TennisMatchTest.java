package com.nofirst.javacatas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisMatchTest {

    private Player playerOne;
    private Player playerTwo;

    private TennisMatch tennisMatch;

    @BeforeEach
    public void setUp() {
        this.playerOne = new Player("John", 0);
        this.playerTwo = new Player("Jane", 0);

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
        assertThat(this.tennisMatch.score()).isEqualTo("Fifteen-Love");
    }

    @Test
    public void it_scores_a_2_0_game()
    {
        this.playerOne.earnPoints(2);
        assertThat(this.tennisMatch.score()).isEqualTo("Thirty-Love");
    }

    @Test
    public void it_scores_a_3_0_game()
    {
        this.playerOne.earnPoints(3);
        assertThat(this.tennisMatch.score()).isEqualTo("Forty-Love");
    }

    @Test
    public void it_scores_a_4_0_game()
    {
        this.playerOne.earnPoints(4);
        assertThat(this.tennisMatch.score()).isEqualTo("Win For John");

        this.playerOne.earnPoints(0);
        this.playerTwo.earnPoints(4);
        assertThat(this.tennisMatch.score()).isEqualTo("Win For Jane");
    }

    @Test
    public void it_scores_a_0_4_game()
    {
        this.playerTwo.earnPoints(4);
        assertThat(this.tennisMatch.score()).isEqualTo("Win For Jane");
    }

    @Test
    public void it_scores_a_4_3_game()
    {
        this.playerOne.earnPoints(4);
        this.playerTwo.earnPoints(3);

        assertThat(this.tennisMatch.score()).isEqualTo("Advantage John");
    }

    @Test
    public void it_scores_a_3_3_game()
    {
        this.playerOne.earnPoints(3);
        this.playerTwo.earnPoints(3);

        assertThat(this.tennisMatch.score()).isEqualTo("Deuce");
    }
}
