package io.zipcoder.interfaces;

import classes.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
/*
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Student student1 = new Student(1l, "bill",50.0);
        Student student2 = new Student(2l, "bill",50.0);

        student1.learn(20);
        student2.learn(20);

        zipCodeWilmington.getStudyMap();
        zipCodeWilmington.getStudyMap();

        double expected = 70;
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);
        System.out.println(actual);

 */

    }

    @Test
    public void testHostLecture2() {

        classes.Instructor instructor = classes.Instructors.getInstance().findById(1l);

        classes.ZipCodeWilmington.hostLecture(instructor, 400.0);
        Map<classes.Student, Double> blah = classes.ZipCodeWilmington.getStudyMap();

        StringBuilder output = new StringBuilder();
        for (classes.Student student : blah.keySet()) {
            output.append(String.format("%s\t%s\n", student.getName(), blah.get(student)));
        }
        String actual = output.toString();
        String expected = "Bill\t" + "183.33333333333334\n" +
                "Bill\t" + "183.33333333333334\n" +
                "Steve\t" + "183.33333333333334\n";




        Assert.assertEquals(expected, actual);
    }
}
