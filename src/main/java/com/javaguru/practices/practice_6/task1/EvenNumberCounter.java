package com.javaguru.practices.practice_6.task1;

class EvenNumberCounter {

    /**
     * Тема: циклы (for / while / do-while)
     * <p>
     * Задание 1: Необходимо дополнить метод getEvenNumberCount таким образом,
     * чтобы результатом работы метода было количество четных чисел в интервале от from до to (включительно)
     */

    int getEvenNumberCount(int from, int to) {
        int evenNumberCount = 0;
        for (int i = from; i <= to; i++) {
            if(i % 2 == 0) {
                evenNumberCount++;
            }

        }
        return evenNumberCount;
    }
}
