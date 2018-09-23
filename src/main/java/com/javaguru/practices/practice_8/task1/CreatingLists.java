package com.javaguru.practices.practice_8.task1;

import java.util.ArrayList;
import java.util.List;

class CreatingLists {

    /**
     * Задание 1.
     * <p>
     * Необходимо реализовать метод createArrayList таким образом,
     * чтобы результатом выполнения метода был созданный и заполненный список(ArrayList) числами от 1 до size
     * в убывающем порядке
     */

    List<Integer> createArrayList(int size) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            arrayList.add(i);

        }
        return null;
    }

    /**
     * Задание 2.
     * <p>
     * Необходимо реализовать метод таким образом, чтобы результатом работы метода
     * был отсортированный в возр. порядке список целых чисел
     */

    void sortArrayList(List<Integer> integers) {

    }
}
