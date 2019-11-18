package classes;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public abstract class People<E extends Person> implements Iterable<E> {

    List<E> personList;

    public People(){
        this.personList = new ArrayList();
    }

    public void add(E person){
        this.personList.add((E) person);

    }

    public E findById(long id){
        for(E people: personList){
            if(people.getId() == id){
                return people;
            }

        }
        return null;
    }

    public Boolean contains(E person){
        return personList.contains(person);
    }

    public void remove(E person){
        personList.remove(person);
    }
    public void remove(long id){
        for(Person people: personList){
            if(people.getId() == id){
                personList.remove(people);
            }

        }
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public abstract E[] toArray();//{
/*
        Person[] personArr = new Person[ personList.size()];
        int count = 0;

        for(int i = 0; i < personList.size(); i++){
            personArr[count] = personList.get(i);

        }
        return personArr;



    }
*/


    public Iterator<E> iterator() {
        return personList.iterator();

    }





}