package com.nofirst.javacatas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void it_translate_empty_string_into_zero()
    {
        assertThat(this.stringCalculator.add("")).isEqualTo(0);
    }

    @Test
    public void it_finds_the_sum_of_one_number()
    {
        assertThat(this.stringCalculator.add("5")).isEqualTo(5);
    }


    @Test
    public void it_finds_the_sum_of_two_numbers()
    {
        assertThat(this.stringCalculator.add("1,2")).isEqualTo(3);
    }

    @Test
    public void it_finds_the_sum_of_any_numbers()
    {
        assertThat(this.stringCalculator.add("1,2,3,4,5")).isEqualTo(15);
    }

}
