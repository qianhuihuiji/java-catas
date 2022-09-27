package com.nofirst.javacatas;

import java.security.InvalidParameterException;
import java.util.stream.Stream;

public class StringCalculator {
    public int add(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        String[] strings = s.split(",");

     return   Stream.of(strings).map(t -> {
             int intVal = Integer.parseInt(t);

             if (intVal < 0) {
                 throw new InvalidParameterException();
             }

             return intVal;
         }).mapToInt(Integer::intValue).sum();
    }
}
