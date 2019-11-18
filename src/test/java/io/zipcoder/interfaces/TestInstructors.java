package io.zipcoder.interfaces;

import classes.Instructors;
import classes.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void singletonInstructorTest() {
        Instructors testInstructors = Instructors.getInstance();

        Assert.assertTrue(testInstructors instanceof Instructors );
    }


}
