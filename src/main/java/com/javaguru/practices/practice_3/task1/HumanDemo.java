package com.javaguru.practices.practice_3.task1;

public class HumanDemo {
    public static void main(String[] args) {
        String name = "Alexey";
        int age = 31;

        Human firstHuman = new Human(name,age);
        // Я это занятие пропустил, но насколько я понимаю для firstHuman в классе demo мы используем значения заданные в классе Human.
        // А для secondHuman - значения, которые задали уже непосредственно в классе demo. Так? :)
        Human secondHuman = new Human("Новое имя", 666);

        firstHuman.sayHello();
        secondHuman.sayHello();

    }
}
