package com.javaguru.practices.practice_2.task1;

class Calculator {

    /**
     * Тема: Математические операции
     */

    //TODO: Необходимо заполнить тело метода так, чтобы результатом работы была сумма первого и второго числа
    int sum(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    //TODO: Необходимо заполнить тело метода так, чтобы результатом была разность первого и второго числа
    int subtract(int firstNumber, int secondNumber) {
        int subtract = firstNumber - secondNumber;
        return subtract;
    }

    //TODO: Необходимо заполнить тело метода так, чтобы результатом было перемножение первого и второго числа
    int multiply(int firstNumber, int secondNumber) {
        int multiply = firstNumber * secondNumber;
        return multiply;
    }

    //TODO: Необходимо заполнить тело метода так, чтобы результатом было деление первого числа на второе (результатом может быть дробное число)
    double divide(int firstNumber, int secondNumber) {
        double divide = firstNumber / (double) secondNumber;
        return divide;
    }

}
