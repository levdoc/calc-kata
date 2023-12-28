package org.levdoc;

import java.util.Scanner;

import static org.levdoc.NumberConverter.parseToArabic;
import static org.levdoc.NumberConverter.parseToRoman;

class Main {

    public static void main(String[] args) {
        String inputLine = "";
        Scanner scanner = new Scanner(System.in);
//        inputLine = scanner.nextLine().toUpperCase().trim().replaceAll("\\s+", "");
        inputLine = scanner.nextLine().toUpperCase().trim().replaceAll("\\s+", "");

        System.out.println(calc(inputLine));


    }

    public static String calc(String input) {

        String[] strMass = input.split("[+*/-]");
        int i = input.length() - input.replaceAll("[+/*-]", "").length();

        //  Проверка: является ли введенная строка математическим выражением
        if ((i == 0) || (strMass.length < 2)) {
            throw new RuntimeException("Введенная строка не является математической операцией.");
        }
        // Проверка формата математической операции на правильность (верный вариант: [операнд1] [действие(+-/*)] [операнд2])
        if (i > 1) {
            throw new RuntimeException("Формат математической операции не удовлетворяет заданию.");
        }

        //regex ^[MDCLXVI]+$
        // или ^(?=[MDCLXVI])M*(C[MD]|D?C*)(X[CL]|L?X*)(I[XV]|V?I*)$






        System.out.println(strMass[0]);

        return null;
    }

    private static Boolean isValidLineAndOperand (String[] line) {
        return true;
    }

}