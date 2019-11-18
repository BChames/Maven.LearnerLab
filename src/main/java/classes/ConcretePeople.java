package classes;

public class ConcretePeople extends People<Person> {

    public Person[] toArray() {

        Person[] personArr = new Person[personList.size()];
        int count = 0;

        for (int i = 0; i < personList.size(); i++) {
            personArr[count] = personList.get(i);

        }
        return personArr;

    }
}