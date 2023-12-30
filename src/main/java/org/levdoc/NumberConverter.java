package org.levdoc;

class NumberConverter {

    private NumberConverter() {
    }

    /**
     * Метод конвертирует число в арабской записи в римскую
     *
     * @param input римское число
     * @return арабское число
     */
    static String parseToRoman(String input) {

        int value = Integer.parseInt(input);

        StringBuilder result = new StringBuilder();
        for (RomanNumber romanNumber : RomanNumber.getRomanNumberListToRoman()) {
            while (value >= romanNumber.getValue()) {
                result.append(romanNumber);
                value -= romanNumber.getValue();
            }
        }

        return result.toString();
    }

    /**
     * Метод конвертирует число из римской записи в арабскую
     * @param input Римское число
     * @return Арабское число
     */
    static int parseToArabic(String input) {

        int result = 0;
        for (RomanNumber romanNumber : RomanNumber.getRomanNumberListToRoman()) {
            while (input.startsWith(romanNumber.toString())) {
                result += romanNumber.getValue();
                input = input.substring(romanNumber.toString().length());
            }
        }

        return result;
    }
}
