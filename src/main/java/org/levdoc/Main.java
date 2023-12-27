package org.levdoc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {
    static List<RomanNumber> romanNumberList = Arrays.asList(RomanNumber.values());

    public static void main(String[] args) {
        System.out.println(arabicToRoman(3999));
        System.out.println(romanToArabic("MMMCMXCIX"));

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

    /**
     * Метод конвертирует число из римской записи в арабскую
     * @param value Римское число
     * @return Арабское число
     */
    private static int romanToArabic(String value) {

        int result = 0;
        for (RomanNumber romanNumber : romanNumberList) {
            while (value.startsWith(romanNumber.toString())) {
                result = result + romanNumber.getValue();
                value = value.substring(romanNumber.toString().length());
            }
        }

        return result;
    }

}