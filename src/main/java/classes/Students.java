package classes;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import sun.jvm.hotspot.oops.Instance;
import sun.security.jca.GetInstance;

public final class Students extends classes.People<classes.Student> {


    private static final Students INSTANCE;

    private Students() {
//        Student bill = new Student(1l, "Bill", 50.0);
//        Student randy = new Student(2l, "Bill", 50.0);
//        Student otherBasicAmericanName = new Student(3l, "Steve", 50.0);
//
//        INSTANCE.add(bill);
//        INSTANCE.add(randy);
//        INSTANCE.add(otherBasicAmericanName);

    }


    public static Students getInstance() {
        return INSTANCE;
    }

    public classes.Student[] toArray() {
        return personList.toArray(new classes.Student[0]);
    }

    static{
        INSTANCE = new Students();
        classes.Student bill = new classes.Student(1l, "Bill", 50.0);
        classes.Student randy = new classes.Student(2l, "Bill", 50.0);
        classes.Student otherBasicAmericanName = new classes.Student(3l, "Steve", 50.0);

        INSTANCE.add(bill);
        INSTANCE.add(randy);
        INSTANCE.add(otherBasicAmericanName);

    }
}
