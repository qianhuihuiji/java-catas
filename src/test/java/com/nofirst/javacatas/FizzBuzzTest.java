package com.nofirst.javacatas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void it_translate_1_for_fizzbuzz()
    {
        assertThat(this.fizzBuzz.execute(1)).isEqualTo("1");
    }

    @Test
    public void it_translate_2_for_fizzbuzz()
    {
        assertThat(this.fizzBuzz.execute(2)).isEqualTo("2");
    }
}
