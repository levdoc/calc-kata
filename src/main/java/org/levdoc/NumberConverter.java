package org.levdoc;

class NumberConverter {

    private NumberConverter() {
    }

    /**
     * Метод конвертирует число в арабской записи в римскую
     *
     * @param value римское число
     * @return арабское число
     */
    static String parseToRoman(int value) {

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
     * @param value Римское число
     * @return Арабское число
     */
    static int parseToArabic(String value) {

        int result = 0;
        for (RomanNumber romanNumber : RomanNumber.getRomanNumberListToRoman()) {
            while (value.startsWith(romanNumber.toString())) {
                result += romanNumber.getValue();
                value = value.substring(romanNumber.toString().length());
            }
        }

        return result;
    }
}
