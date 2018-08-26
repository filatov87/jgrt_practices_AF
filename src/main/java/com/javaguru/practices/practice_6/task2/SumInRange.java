package com.javaguru.practices.practice_6.task2;

class SumInRange {

    /**
     * Тема: циклы (for / while / do-while)
     * <p>
     * Задание 2: Необходимо дополнить метод sum таким образом,
     * чтобы результатом работы метода сумма чисел в интервале от from до to (включительно)
     */

    int sum(int from, int to) {
        int numbersSum = 0;
        for (int i = from; i <= to; i++) {
            numbersSum = numbersSum + i;

        }
        return numbersSum;
    }
}
