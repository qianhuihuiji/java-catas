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
}
