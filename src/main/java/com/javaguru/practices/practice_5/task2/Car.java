package com.javaguru.practices.practice_5.task2;

import java.util.Objects;

class Car {
    private String manufacturer;
    private String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' + '}';
      }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) &&
                Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, manufacturer);
    }
    /**
 * Необходимо реализовать класс Car.
 *
 * У класса должно быть состояние.
 *    Поле color типа String
 *    Поле manufacturer типа String
 *
 * Не забывайте про модификатор доступа. Для того, чтобы инкапсулировать состояние класса
 * используйте модификатор доступа private
 *
 * Для того, чтобы иметь возможность контролировать состояние класса нам понадобятся
 * геттеры и сеттеры (getters & setters) для каждого из полей
 *
 * Для того чтобы вывести на консоль информацию о состоянии класса, необходимо переопределить
 * метод toString()
 *
 * Чтобы можно было сравнивать экземпляры класса (объекты) Car по их состоянию, необходимо
 * переопределить метод equals таким образом, чтобы все поля участвовали в сравнении
 */
}
