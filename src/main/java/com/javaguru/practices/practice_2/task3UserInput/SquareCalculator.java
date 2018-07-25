package com.javaguru.practices.practice_2.task3UserInput;

import java.util.Scanner;

import static java.lang.System.in;

public class SquareCalculator {
    /**
     * Необходимо создать класс SquareCalculator
     * Описать в SquareCalculator метод calculateSquare. Результатом работы метода должно быть переданное в метод число в квадрате
     * Продемонстрировать работу в классе SquareCalculatorDemo (main метод должен быть только в этом классе)
     */
    int squareResult(int firstNumber) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int squareResult = firstNumber * firstNumber;
        return (squareResult);
    }
}