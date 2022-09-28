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

    @Test
    public void it_translate_6_for_fizzbuzz()
    {
        assertThat(this.fizzBuzz.execute(6)).isEqualTo("fizz");
    }

    @Test
    public void it_translate_10_for_fizzbuzz()
    {
        assertThat(this.fizzBuzz.execute(10)).isEqualTo("buzz");
    }

    @Test
    public void it_translate_15_for_fizzbuzz()
    {
        assertThat(this.fizzBuzz.execute(15)).isEqualTo("fizzbuzz");
    }

    @Test
    public void it_translate_123_for_fizzbuzz()
    {
        assertThat(this.fizzBuzz.execute(123)).isEqualTo("fizz");
    }

    @Test
    public void it_translate_150_for_fizzbuzz()
    {
        assertThat(this.fizzBuzz.execute(150)).isEqualTo("fizzbuzz");
    }
}
