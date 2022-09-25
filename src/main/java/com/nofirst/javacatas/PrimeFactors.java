package com.nofirst.javacatas;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public int[] generate(int number) {
        List<Integer> primes = new ArrayList<>();

        int candidate = 2;

        while(number > 1)
        {
            while(number % candidate == 0)
            {
                primes.add(candidate);

                number /= candidate;
            }

            candidate++;
        }

        return primes.stream().mapToInt(Integer::intValue).toArray();
    }
}
