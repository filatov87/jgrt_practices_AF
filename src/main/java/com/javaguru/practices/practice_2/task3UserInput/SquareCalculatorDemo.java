package com.javaguru.practices.practice_2.task3UserInput;

import java.util.Scanner;

import static java.lang.System.in;

public class SquareCalculatorDemo {
    /**
     * Необходимо создать класс SquareCalculator
     * Описать в SquareCalculator метод calculateSquare. Результатом работы метода должно быть переданное в метод число в квадрате
     * Продемонстрировать работу в классе SquareCalculatorDemo (main метод должен быть только в этом классе)
     */
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(in);
        int userInputNumber = sc.nextInt();
        int squaredUserInputNumber = userInputNumber*userInputNumber;
        System.out.println("Квадрат введённого числа =" + squaredUserInputNumber);
    }
}
