package classes;

public class Instructors extends People<Instructor> {

    static final Instructors INSTANCE;

    private Instructors(){

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public classes.Instructor[] toArray(){
        return personList.toArray(new classes.Instructor[0]);
    }

    static{
        INSTANCE = new Instructors();
        classes.Instructor bill = new classes.Instructor(1l, "Bill");
        classes.Instructor randy = new classes.Instructor(2l, "Bill");
        classes.Instructor otherBasicAmericanName = new classes.Instructor(3l, "Steve");

        INSTANCE.add(bill);
        INSTANCE.add(randy);
        INSTANCE.add(otherBasicAmericanName);

    }

}