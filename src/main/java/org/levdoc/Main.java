package org.levdoc;

import java.util.Scanner;

import static org.levdoc.NumberConverter.parseToArabic;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLine()));

    }


    public static String calc(String input) {
        if (checkInputLine(input)) {
            String[] strMass = input.toUpperCase().trim().replaceAll("\\s+", "").split(Settings.RIGHT_MATH_OPERATION_PATTERN);

            char mathematicalAction = getMathematicalAction(input);

            try {
                if (isInteger(strMass[0]) && isInteger(strMass[1])) {
                    Calc calc = new Calc(Integer.parseInt(strMass[0]), Integer.parseInt(strMass[1]), mathematicalAction, false);
                    return calc.getResult();
                }
            } catch (NumberFormatException e) {
                if (strMass[0].matches(Settings.ROME_NUMBER_CHECK_PATTERN) && strMass[1].matches(Settings.ROME_NUMBER_CHECK_PATTERN)) {
                    Calc calc = new Calc(parseToArabic(strMass[0]), parseToArabic(strMass[1]), mathematicalAction, true);
                    return calc.getResult();
                } else {
                    throw new ArithmeticException(Errors.CheckInputLine.INPUT_ERROR_NOT_RIGHT_OPERAND);
                }
            }
        }
        throw new ArithmeticException(Errors.CheckInputLine.INPUT_ERROR_NOT_RIGHT_OPERAND);
    }

    /**
     * Метод получает из введенной строки тип математической операции
     *
     * @param input математическая строка
     * @return возвращает математическую операцию из введенной строки
     */
    private static char getMathematicalAction(String input) {
        if (input.contains("+")) {
            return '+';
        } else if (input.contains("-")) {
            return '-';
        } else if (input.contains("*")) {
            return '*';
        } else if (input.contains("/")) {
            return '/';
        } else {
            throw new RuntimeException(Errors.CheckInputLine.INPUT_ERROR_NOT_RIGHT_MATH_OPERATION);
        }
    }

    /**
     * Метод проверяет введенное математическое выражение на синтаксическую правильность
     *
     * @param input строка математического выражения
     * @return возвращает результат проверка соответствия выражения требованиям
     */
    private static boolean checkInputLine(String input) {
        String[] strMass = input.split("[+*/-]");
        int i = input.length() - input.replaceAll("[+/*-]", "").length();

        if ((i == 0) || (strMass.length < 2)) {
            throw new RuntimeException(Errors.CheckInputLine.INPUT_ERROR_NOT_MATH_LINE);
        }

        if (i > 1) {
            throw new RuntimeException(Errors.CheckInputLine.INPUT_ERROR_NOT_RIGHT_OPERATION);
        }
        return true;
    }

    /**
     * Метод проверяет являться ли указанная строка числом
     *
     * @param input строка
     * @return результат проверки
     */
    private static boolean isInteger(String input) {
        try {
            Integer.getInteger(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}