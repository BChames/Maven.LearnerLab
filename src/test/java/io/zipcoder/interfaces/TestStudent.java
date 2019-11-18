package io.zipcoder.interfaces;

import classes.Person;
import classes.Student;
import interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {


    @Test
    public void testImplementation(){
        Student testStudent = new Student(1l, "bill",50.0);

        Assert.assertTrue(testStudent instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student testStudent = new Student(1l, "bill",50.0);

        Assert.assertTrue(testStudent instanceof Person);

    }

    @Test
    public void testLearn(){

        Student testStudent = new Student(1l, "bill",50.0);
        double expected = 100;

        testStudent.learn(50);
        double actual = testStudent.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.0);
    }
}
