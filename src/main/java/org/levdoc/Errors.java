package org.levdoc;


interface Errors {
    class CheckInputLine {
        public static final String INPUT_ERROR_NOT_MATH_LINE = "Ошибка: Введенная строка не является математической операцией.";
        public static final String INPUT_ERROR_NOT_RIGHT_OPERATION = "Ошибка: Формат математической операции не удовлетворяет заданию.";
        public static final String INPUT_ERROR_NOT_RIGHT_OPERAND = "Ошибка: используются одновременно разные системы счисления " +
                "или допущена ошибка в написании римского числа.";
        public static final String INPUT_ERROR_NOT_RIGHT_MATH_OPERATION = "Ошибка: Не удалось определить тип математической операции.";
    }

    class CalcException {
        public static final String ERROR_ON_INPUT_NUMBER = "Ошибка: Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.";
        public static final String ERROR_ON_OUTPUT_ROME_NUMBER = "Ошибка: Римские числа строго больше 0 и не могут быть отрицательным числом.";
    }
}
