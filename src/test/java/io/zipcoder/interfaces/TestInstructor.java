package io.zipcoder.interfaces;

import classes.Instructor;
import classes.Person;
import classes.Student;
import interfaces.Learner;
import interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {


    @Test
    public void testImplementation() {
        Instructor testInstructor = new Instructor(356l, "Jimbo");

        Assert.assertTrue(testInstructor instanceof Teacher);

    }

    @Test
    public void testInheritance() {
        Instructor testInstructor = new Instructor(103L, "Dick");

        Assert.assertTrue(testInstructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor testInstructor = new Instructor(239l, "paul");
        Student testStudent = new Student(1l, "bill", 50.0);
        double expected = 100;

        testInstructor.teach(testStudent, 50);
        double actual = testStudent.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

    /*
Create a testLecture method that ensures when an Instructor invokes the lecture method,
a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.

 */
    @Test
    public void testLecture() {
        Instructor testInstructor = new Instructor(35l, "Olaf");
        Student testStudent1 = new Student(1l, "bill", 50.0);
        Student testStudent2 = new Student(2l, "bill", 50.0);
        Learner[] testLearnerArr = new Learner[2];
        testLearnerArr[0] = testStudent1;
        testLearnerArr[1] = testStudent2;

        double expectedStudy1 = 75.0;
        double expectedStudy2 = 75.0;
        testInstructor.lecture(testLearnerArr, 50);

        double actualStudy1 = testStudent1.getTotalStudyTime();
        double actualStudy2 = testStudent2.getTotalStudyTime();

        Assert.assertEquals(expectedStudy1, actualStudy1, 0.0);
        Assert.assertEquals(expectedStudy2, actualStudy2, 0.0);

    }

}
