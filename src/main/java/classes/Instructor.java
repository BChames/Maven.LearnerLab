package classes;

import interfaces.Learner;
import interfaces.Teacher;

public class Instructor extends Person implements Teacher {

    //double totalTeachTime;

    public Instructor(Long id, String name) {
        super(id, name);
    }


    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours){

        for(Learner student: learners){
            student.learn(numberOfHours / learners.length);
        }

    }
}
