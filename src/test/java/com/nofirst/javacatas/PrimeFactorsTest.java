package com.nofirst.javacatas;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    private final PrimeFactors primeFactors = new PrimeFactors();

    @Test
    public void it_returns_an_empty_array_for_1()
    {
        assertThat(this.primeFactors.generate(1)).isEmpty();
    }

    @Test
    public void it_returns_2_for_2()
    {
        assertThat(this.primeFactors.generate(2)).isEqualTo(new int[]{2});
    }

    @Test
    public void it_returns_3_for_3()
    {
        assertThat(this.primeFactors.generate(3)).isEqualTo(new int[]{3});
    }

    @Test
    public void it_returns_2_2_for_4()
    {
        assertThat(this.primeFactors.generate(4)).isEqualTo(new int[]{2,2});
    }

    @Test
    public void it_returns_5_for_5()
    {
        assertThat(this.primeFactors.generate(5)).isEqualTo(new int[]{5});
    }

    @Test
    public void it_returns_2_3_for_6()
    {
        assertThat(this.primeFactors.generate(6)).isEqualTo(new int[]{2,3});
    }

    @Test
    public void it_returns_2_2_2_for_8()
    {
        assertThat(this.primeFactors.generate(8)).isEqualTo(new int[]{2,2,2});
    }

    @Test
    public void it_returns_3_3_for_9()
    {
        assertThat(this.primeFactors.generate(9)).isEqualTo(new int[]{3,3});
    }

    @Test
    public void it_returns_2_2_5_5_for_100()
    {
        assertThat(this.primeFactors.generate(100)).isEqualTo(new int[]{2,2,5,5});
    }
}
