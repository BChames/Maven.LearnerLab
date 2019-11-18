package classes;

import interfaces.Learner;
import interfaces.Teacher;

public enum  Educator implements Teacher {

    KRIS(new Instructor(23l, "Kris"), 0.0);

    private final Instructor instructor;
    private  Double timeWorks;

    Educator(Instructor a, Double timeWorks){
        this.instructor = a;
        this.timeWorks = timeWorks;
        Instructors instructors = Instructors.getInstance();
        instructors.add(instructor);

    }

    public void teach(Learner learner, double numberOfHours){
        this.instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learner, double numberOfHours){
        this.instructor.lecture(learner, numberOfHours);
    }
}
