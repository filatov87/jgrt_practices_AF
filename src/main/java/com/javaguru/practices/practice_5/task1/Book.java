package com.javaguru.practices.practice_5.task1;

import java.util.Objects;

class Book {
private String author;
private String title;
private int pageCount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(author, title, pageCount);
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    /**
     * Необходимо реализовать класс Book.
     *

     * У класса должно быть состояние.
     *    Поле author типа String
     *    Поле title типа String
     *    Поле pageCount типа int
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
     * Чтобы можно было сравнивать экземпляры класса (объекты) Book по их состоянию, необходимо
     * переопределить метод equals таким образом, чтобы все 3 поля участвовали в сравнении
     */
}
