package pl.akademiakodu.helloHibernate;

public class Person<T> {

    T name;

    T surname;

    public Person(T name, T surname) {
        this.name = name;
        this.surname = surname;
    }

    public static void main(String[] args) {
        Person<String> person = new Person<>("Adam","Kowalski");
    }

}
