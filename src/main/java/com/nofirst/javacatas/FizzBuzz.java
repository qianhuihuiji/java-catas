package com.nofirst.javacatas;

public class FizzBuzz {
    public String execute(int number) {
        if (number % 5 == 0) {
            return "buzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }

        return String.valueOf(number);
    }
}
