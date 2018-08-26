package homeworks.Circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус");
        double radius = scanner.nextDouble();
        Circle circle = new Circle();
        circle.setRadius(radius);
        double area = circle.calculateArea();
        System.out.println("Площадь окружности с радиусом " + radius + " равна " + area);
    }
}
