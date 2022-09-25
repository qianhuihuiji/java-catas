package com.nofirst.javacatas;

public class RomanNumeralsConverter {

    public String convert(int number) {
        StringBuilder solution = new StringBuilder();

        while(number >= 5)
        {
            solution.append("V");

            number -= 5;
        }

        while(number >= 4)
        {
            solution.append("IV");

            number -= 4;
        }

        while(number >= 1)
        {
            solution.append("I");

            number -= 1;
        }

        return solution.toString();
    }
}
