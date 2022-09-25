package com.nofirst.javacatas;

public class PrimeFactors {
    public int[] generate(int i) {
        if (i > 1) {
            return new int[]{2};
        }

        return new int[]{};
    }
}
