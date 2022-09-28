package com.nofirst.javacatas;

public class FizzBuzz {
    public String execute(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }

        return String.valueOf(number);
    }

    public String[] executeUpTo(int max) {
        String[] result = new String[max];
        for (int i = 1;i<=max;i++) {
            result[i-1] = execute(i);
        }
        return result;
    }
}
