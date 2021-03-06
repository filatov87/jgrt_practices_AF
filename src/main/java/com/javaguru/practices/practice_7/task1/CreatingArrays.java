package com.javaguru.practices.practice_7.task1;

import java.util.Random;

class CreatingArrays {

    /**
     * Необходимо создать массив для n элементов и заполнить случайными числами от 10 до 20 (включительно)
     */

    Integer[] integerArray(int n) {
        Integer[] array = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
        return array;

    }

    /**
     * Необходимо создать и заполнить массив строками от A - Z. Используйте ASCII таблицу
     * <p>
     * Hint 1: Приведение типов
     * int i = 65;
     * char c = (char) i; // A
     * <p>
     * Hint 2: Методы у объекта String
     * У объекта String существует множество методов. Один из них это valueOf(c),
     * с помощью которого можно получить строку из символа.
     * String.valueOf(c)
     */

    String[] stringArray() {
        String[] array;
        array = new String[26];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(i);
char c = (char) i;
            System.out.print(c + " ");

        }
        return array;
    }
}
