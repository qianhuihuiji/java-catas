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

    @Test
    public void it_translate_3_for_fizzbuzz()
    {
        assertThat(this.fizzBuzz.execute(3)).isEqualTo("fizz");
    }

    @Test
    public void it_translate_5_for_fizzbuzz()
    {
        assertThat(this.fizzBuzz.execute(5)).isEqualTo("buzz");
    }
}
