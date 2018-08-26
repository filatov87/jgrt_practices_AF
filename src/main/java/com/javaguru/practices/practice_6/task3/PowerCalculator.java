package com.javaguru.practices.practice_6.task3;

class PowerCalculator {

    /**
     * Необходимо реализовать метод таким образом,
     * чтобы результатом было число (number) возведенное в степень (power)
     *
     * Примечание: описать алгоритм для положительтый чисел
     */
    int pow(int number, int power) {
        int result = 1;
        for (int i=1; i <= power; i++)
            result = result * number;
        return result;
    }
}
