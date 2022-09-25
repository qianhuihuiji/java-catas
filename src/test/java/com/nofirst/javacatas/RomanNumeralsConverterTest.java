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

    @Test
    public void it_returns_II_for_2()
    {
        assertThat(this.romanNumeralsConverter.convert(2)).isEqualTo("II");
    }

    @Test
    public void it_returns_IV_for_4()
    {
        assertThat(this.romanNumeralsConverter.convert(4)).isEqualTo("IV");
    }

    @Test
    public void it_returns_V_for_5()
    {
        assertThat(this.romanNumeralsConverter.convert(5)).isEqualTo("V");
    }
}
