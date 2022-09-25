package com.nofirst.javacatas;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public int[] generate(int number) {
        List<Integer> primes = new ArrayList<>();

        while(number % 2 == 0){
            primes.add(2);

            number /= 2;
        }

        if(number > 1){
            primes.add(number);
        }

        return primes.stream().mapToInt(Integer::intValue).toArray();
    }
}
