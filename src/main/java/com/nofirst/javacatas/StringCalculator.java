package com.nofirst.javacatas;

import java.security.InvalidParameterException;
import java.util.stream.Stream;

public class StringCalculator {
    private static final int MAX_VALID_NUMBER = 100;

    public int add(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        String[] strings = parseNumberStr(s);

        return   Stream.of(strings).map(t -> {
             int intVal = Integer.parseInt(t);

             if (guardAgainstInvalidNumber(intVal)) {
                 throw new InvalidParameterException("Invalid number provided:" + intVal);
             }

             if (intVal > MAX_VALID_NUMBER) {
                 return 0;
             }

             return intVal;
         }).mapToInt(Integer::intValue).sum();
    }

    private static String[] parseNumberStr(String s) {
        String regex = "\s*(,|\n)\s*";

        return s.split(regex);
    }

    private static boolean guardAgainstInvalidNumber(int intVal) {
        return intVal < 0;
    }
}
