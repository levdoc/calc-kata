package org.levdoc;

class Calc {
    int operand1, operand2, result;
    char mathematicalAction;
    boolean isRomeNumber;

    public Calc(int operand1, int operand2, char mathematicalAction, boolean isRomeNumber) {
        if (((operand1 >= Settings.MIN_NUMBER) && (operand1 <= Settings.MAX_NUMBER))
                && ((operand2 >= Settings.MIN_NUMBER) && (operand2 <= Settings.MAX_NUMBER))) {
            this.operand1 = operand1;
            this.operand2 = operand2;
        } else {
            throw new IllegalArgumentException(Errors.CalcException.ERROR_ON_INPUT_NUMBER);
        }

        this.mathematicalAction = mathematicalAction;
        this.isRomeNumber = isRomeNumber;
    }

    private void calculate() {
        switch (mathematicalAction) {
            case '+':
                result = operand1 + operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
        }
    }

    public String getResult() {
        calculate();

        if (isRomeNumber) {
            if (result<1) {
                throw new ArithmeticException(Errors.CalcException.ERROR_ON_OUTPUT_ROME_NUMBER);
            } else {
                return NumberConverter.parseToRoman(String.valueOf(result));
            }
        } else {
            return String.valueOf(result);
        }
    }

}
