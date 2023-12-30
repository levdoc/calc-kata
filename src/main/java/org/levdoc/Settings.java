package org.levdoc;

/**
 * Основные настройки приложения
 */
interface Settings {
    /**
     * Минимально возможное число для использования в расчётах
     */
    int MIN_NUMBER = 1;
    /**
     * Максимальное возможное число для использования в расчётах
     */
    int MAX_NUMBER = 10;
    /**
     * Паттерн проверки римского числа
     */
    String ROME_NUMBER_CHECK_PATTERN = "^(?=[MDCLXVI])M*(C[MD]|D?C*)(X[CL]|L?X*)(I[XV]|V?I*)$";
    /**
     * Паттерн проводимых математических операций
     */
    String RIGHT_MATH_OPERATION_PATTERN = "[+*/-]";
}
