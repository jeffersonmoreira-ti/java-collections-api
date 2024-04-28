package app;

import sorting.PersonSorting;

public class MainPerson {
    public static void main(String[] args) {
        PersonSorting personSorting = new PersonSorting();
        personSorting.addPerson("Jeff",30,1.78);
        personSorting.addPerson("Rick",54,1.70);
        personSorting.addPerson("Chum",30,1.72);
        personSorting.addPerson("Cory",28,1.88);

        System.out.println(personSorting.personOrderedByAge());
        System.out.println("\n-------------------------------");
        System.out.println(personSorting.personOrderedByHeight());
    }
}
