package io.zipcoder.interfaces;


import classes.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {

    private classes.People<classes.Person> peopleList;
    private classes.Person bill;
    private classes.Person randy;

    @Before
    public void setup() {
        peopleList = new classes.ConcretePeople();
        bill = new classes.Person(1l, "Bill");
        randy = new classes.Person(2l, "Randy");
    }

    @After
    public void removeAllValues() {
        peopleList.removeAll();
    }

    @Test
    public void currentValues() {
    }

    @Test
    public void testAdd() {

        peopleList.add(bill);

        int expected = 1;
        int actual = peopleList.count();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove() {

        peopleList.remove(randy);
        Boolean actual = peopleList.contains(randy);

        Assert.assertFalse(actual);

    }


}
