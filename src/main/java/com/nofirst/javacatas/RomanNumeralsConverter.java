package com.nofirst.javacatas;

import java.util.ArrayList;
import java.util.List;

public class RomanNumeralsConverter {

    private static final List<RomanNumeralMap> lookup = new ArrayList<>();

    static {
        lookup.add(new RomanNumeralMap(50, "L"));
        lookup.add(new RomanNumeralMap(40, "XL"));
        lookup.add(new RomanNumeralMap(10, "X"));
        lookup.add(new RomanNumeralMap(5, "V"));
        lookup.add(new RomanNumeralMap(4, "IV"));
        lookup.add(new RomanNumeralMap(1, "I"));
    }

    public String convert(int number) {
        StringBuilder solution = new StringBuilder();

        for (RomanNumeralMap entry : lookup) {
            Integer limit = entry.getKey();
            String glyph = entry.getValue();

            while(number >= limit)
            {
                solution.append(glyph);

                number -= limit;
            }
        }

        return solution.toString();
    }

    static class RomanNumeralMap {

        private final Integer key;
        private final String value;

        public Integer getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public RomanNumeralMap(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
