package main.java;

import main.java.lesson3.Name;

public class Person {

    private Name personName;

    private static int personCounter;

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person() {
        personCounter++;
    }

    public String helloWorld() {
        return "Hello World";
    }
    public String helloPerson(String name) {
        return "Hello " + name.toString();
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}