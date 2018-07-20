package com.javaguru.practices.practice_2.task3UserInput;

import java.util.Scanner;

import static java.lang.System.in;

public class SquareCalculator {
    /**
     * Необходимо создать класс SquareCalculator
     * Описать в SquareCalculator метод calculateSquare. Результатом работы метода должно быть переданное в метод число в квадрате
     * Продемонстрировать работу в классе SquareCalculatorDemo (main метод должен быть только в этом классе)
     */
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(in);
        double userInputNumber = sc.nextDouble();
        double squaredUserInputNumber = userInputNumber*userInputNumber;
        System.out.println("Квадрат введённого числа =" + (double)squaredUserInputNumber);
    }
}
