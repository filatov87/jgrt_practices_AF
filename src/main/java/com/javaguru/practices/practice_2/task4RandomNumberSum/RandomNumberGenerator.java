package com.javaguru.practices.practice_2.task4RandomNumberSum;

import java.util.Random;

class RandomNumberGenerator {

        int firstNumber = Random.nextInt(101);
        int secondNumber = Random.nextInt(101);
        int thirdNumber = Random.nextInt(101);
        int randomSum = firstNumber + secondNumber + thirdNumber;
        return randomSum

}


/**
 * Написать консольную программу, которая генерит 3 случайных числа в диапазоне от 0 до 100 (включительно),
 * <p>
 * выводит их на консоль и подсчитывает их сумму.
 * <p>
 * Объектный вариант
 * 1. Необходимо создать класс RandomNumberGenerator. Описать в данном классе метод generateRandomNumber, таким образом, чтобы можно было передать интервал (from, to). Результатом работы метода должно быть целое число от from до to.
 * 2. Необходимо создать класс Calculator. Описать метод sumThreeNumbers таким образом, чтобы в метод можно было передать 3 числа, результатом работы метода должна быть сумма 3 чисел
 * 3. Продемонстрировать работу классов в RandomNumbersDemo (main метод должен быть только в этом классе)
 */