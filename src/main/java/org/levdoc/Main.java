package org.levdoc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {
    static List<RomanNumber> romanNumberList = Arrays.asList(RomanNumber.values());

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(arabicToRoman(93));
    }

    public static String calc(String input) {
        return null;
    }

    /**
     * Метод конвертирует число в римской записи в арабскую
     *
     * @param value римское число
     * @return арабское число
     */
    private static String arabicToRoman(int value) {
        Collections.reverse(romanNumberList);

        StringBuilder result = new StringBuilder();
        for (RomanNumber romanNumber : romanNumberList) {
            while (value >= romanNumber.getValue()) {
                result.append(romanNumber);
                value -= romanNumber.getValue();
            }
        }

        return result.toString();
    }

}