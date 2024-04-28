package sorting;

import model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSorting {
    private List<Person> personList;

    public PersonSorting() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        this.personList.add(new Person(name, age, height));
    }

    public List<Person> personOrderedByAge() {
        List<Person> personByAge = new ArrayList<>(personList);
        Collections.sort(personByAge);
        return personByAge;
    }

    public List<Person> personOrderedByHeight() {
        List<Person> personByHeight = new ArrayList<>(personList);
        personByHeight.sort(new ComparatorPersonByHeight());
        return personByHeight;
    }

}
