package classes;

import interfaces.Teacher;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ZipCodeWilmington {

    private static final classes.Students students = classes.Students.getInstance();
    private static final classes.Instructors instructors = classes.Instructors.getInstance();

    public static  void hostLecture(Teacher teacher, double numberOfHours){

        teacher.lecture(students.toArray(), numberOfHours);
    }

    public static HashMap<classes.Student, Double> getStudyMap(){
        LinkedHashMap<classes.Student, Double> map = new LinkedHashMap<classes.Student, Double>();
        for(classes.Student student: students){
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }

    public static void hostLecture(long id, double numberOfHours){

        Teacher teacher = new classes.Instructor(id , "Bill");
        teacher.lecture(students.toArray(), numberOfHours);

    }


}

