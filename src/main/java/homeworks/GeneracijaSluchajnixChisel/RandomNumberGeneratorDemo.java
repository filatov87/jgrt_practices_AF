package homeworks.GeneracijaSluchajnixChisel;

import java.util.Random;

public class RandomNumberGeneratorDemo {

    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int firstRandomNumber = randomGenerator.nextInt(101);
        System.out.println("First randomly generated number is " +firstRandomNumber);
        int secondRandomNumber = randomGenerator.nextInt(101);
        System.out.println("Second randomly generated number is " + secondRandomNumber);
        int thirdRandomNumber = randomGenerator.nextInt(101);
        System.out.println("Third randomly generated number is " + thirdRandomNumber);

        int sumRandomNumbers = firstRandomNumber + secondRandomNumber + thirdRandomNumber;

        System.out.println("Sum of three random generated numbers is " + sumRandomNumbers);

    }
}
