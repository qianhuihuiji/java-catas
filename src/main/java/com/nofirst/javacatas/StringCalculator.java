package com.nofirst.javacatas;

import java.util.stream.Stream;

public class StringCalculator {
    public int add(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        String[] strings = s.split(",");

        return Stream.of(strings).mapToInt(Integer::parseInt).sum();
    }
}
