package io.zipcoder.interfaces;

import classes.Student;
import classes.Students;
import org.junit.Test;
import org.junit.Assert;

public class TestStudents {

    private Students students;

    @Test
    public void singletonStudentsTest() {
        Students student1 = Students.getInstance();
        students = Students.getInstance();

        Assert.assertNotNull(students);
    }

    @Test
    public void singletonStudentsTest2() {
        Students testStudents = Students.getInstance();
        Students testStudents2 = Students.getInstance();

        Assert.assertEquals(testStudents, testStudents2);
    }


}
