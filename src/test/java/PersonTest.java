package test.java;

import main.java.Person;
import main.java.lesson10.LoggingLevel;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.sql.Array;
import java.util.Arrays;
import java.util.concurrent.locks.StampedLock;

public class PersonTest {

    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    private static final int PENDING = 40;
    private static final int PROCESSING = 41;
    private static final int PROCESSED = 42;

    public String[] states() {
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }

    @Test
    public void shouldReturnHelloWorld() {
        Person luis = new Person();
        Assert.assertEquals("Hello World", luis.helloWorld());
    }

    @Test
    public void shouldReturnHelloWorldLuis(){
        Person person = new Person();
        Assert.assertEquals("Hello Luis", person.helloPerson("Luis"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Assert.assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnNumberOfPersonsInForLoop() {

        Person person0;
        for (int counter = 0; counter < 4; counter++) {
            person0 = new Person();
        }

        Assert.assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnNumberOfPersonsInWhileLoop() {

        Person person0;

        int iterator = 0;

        while (iterator < 4) {
            person0 = new Person();

            iterator++;
        }

        Assert.assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void demonstrateArrays() {

        Person[] persons = new Person[4];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
        }

        for (Person person : persons) {
            person.helloWorld();
        }

        Person myPerson = new Person();
        Person myPerson2 = null;
        final Person[] persons2 = {persons[0], null, myPerson, myPerson2};

        LoggingLevel state = LoggingLevel.PROCESSING;

        int myState = PENDING;

        /*

        switch (state) {
            case PENDING:
                callMethod();
                break;
            case PROCESSING:
                callMethod();
            case PROCESSED:
                callMethod();
        }

        for (LoggingLevel state: LoggingLevel.values()){
            if(state == LoggingLevel.PENDING) {
                callMethod();
            }

            if(state == LoggingLevel.PROCESSING) {
                callMethod();
            }

            if(state == LoggingLevel.PROCESSED) {
                callMethod();
            }
        }
         */

    }

    @Test
    public void demonstrateRateBoolean() {

        boolean monday = false;
        boolean raining = true;
        boolean thuesday = true;
        boolean sunny = false;

    }
}
