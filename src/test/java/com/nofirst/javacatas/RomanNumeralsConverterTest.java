package com.nofirst.javacatas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsConverterTest {

    private final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

    @Test
    public void it_returns_I_for_1()
    {
        assertThat(this.romanNumeralsConverter.convert(1)).isEqualTo("I");
    }
}
