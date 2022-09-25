package com.nofirst.javacatas;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    @Test
    public void it_returns_an_empty_array_for_1()
    {
        PrimeFactors primeFactors = new PrimeFactors();
        assertThat(primeFactors.generate(1)).isEmpty();
    }

}
