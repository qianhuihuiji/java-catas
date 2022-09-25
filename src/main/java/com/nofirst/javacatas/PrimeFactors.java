package com.nofirst.javacatas;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public int[] generate(int number) {
        List<Integer> primes = new ArrayList<>();
        int candidate = 2;

        for(candidate = 2;number > 1;candidate++)
        {
            for(;number % candidate == 0;number /= candidate)
            {
                primes.add(candidate);
            }
        }

        return primes.stream().mapToInt(Integer::intValue).toArray();
    }
}
