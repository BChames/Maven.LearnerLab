package classes;

public class Person {

    final long id;
    String name;
/*
    public Person(){
        this.id = 0l;
        this.name = "";
    }

 */

    public Person(){
        id = Long.MIN_VALUE;
        name = "";
    }

    public Person(long id, String name){
        this.id = id;
        this.name = name;

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
