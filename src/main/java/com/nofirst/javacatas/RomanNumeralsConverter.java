package com.nofirst.javacatas;

public class RomanNumeralsConverter {

    public String convert(int number) {
        StringBuilder solution = new StringBuilder();

        while(number >= 1)
        {
            solution.append('I');

            number -= 1;
        }

        return solution.toString();
    }
}
