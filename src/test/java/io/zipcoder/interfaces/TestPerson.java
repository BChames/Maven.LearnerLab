package io.zipcoder.interfaces;

import classes.Person;
import classes.Student;
import classes.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void ConstructorTest(){
        Person testPerson = new Person(3L, "Bill");
        long expectedLong = 3L;
        String expectedName = "Bill";

        long actualLong = testPerson.getId();
        String actualName = testPerson.getName();

        Assert.assertEquals(expectedLong, actualLong);
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void setNameTest(){
        Person testPerson = new Person(3L, "Bill");
        String expectedName = "Bill";

        testPerson.setName("Bill");
        String actualName = testPerson.getName();

        Assert.assertEquals(expectedName, actualName);


    }
}
