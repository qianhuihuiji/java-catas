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

}
