package homeworks.VozvedenieVoVtorujuStepenj;

import java.util.Scanner;

public class SquareCalculator {
    /**
     * Необходимо создать класс SquareCalculator
     * Описать в SquareCalculator метод calculateSquare. Результатом работы метода должно быть переданное в метод число в квадрате
     * Продемонстрировать работу в классе SquareCalculatorDemo (main метод должен быть только в этом классе)
     */
    int squareResult(int firstNumber) {
        Scanner scanner = new Scanner(System.in);
        int firstUserNumber = scanner.nextInt();
        return (firstUserNumber * firstUserNumber);
    }
}