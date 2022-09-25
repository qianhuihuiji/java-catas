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

    @Test
    public void it_returns_X_for_10()
    {
        assertThat(this.romanNumeralsConverter.convert(10)).isEqualTo("X");
    }

    @Test
    public void it_returns_XL_for_40()
    {
        assertThat(this.romanNumeralsConverter.convert(40)).isEqualTo("XL");
    }

    @Test
    public void it_returns_L_for_50()
    {
        assertThat(this.romanNumeralsConverter.convert(50)).isEqualTo("L");
    }

    @Test
    public void it_returns_XLIV_for_44()
    {
        assertThat(this.romanNumeralsConverter.convert(44)).isEqualTo("XLIV");
    }

    @Test
    public void it_returns_XLIV_for_49()
    {
        assertThat(this.romanNumeralsConverter.convert(44)).isEqualTo("XLIV");
    }
}
