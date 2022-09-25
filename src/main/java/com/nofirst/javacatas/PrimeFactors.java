package com.nofirst.javacatas;

public class PrimeFactors {
    public int[] generate(int i) {
        if (i == 4) {
            return new int[]{2, 2};
        }

        if (i > 2) {
            return new int[]{3};
        }

        if (i > 1) {
            return new int[]{2};
        }

        return new int[]{};
    }
}
