package com.flores.javacore.collections;

import com.flores.oop.Gender;
import com.flores.oop.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCollections {

    private List<Person> listOfPersons;

    public MainCollections(){
        createPersons();
        init();


    }


    /***
     *  Loop through a Collection (ArrayList)
     */
    private void createPersons() {

        listOfPersons = new ArrayList<>();
        Person p1 = new Person("Kalle",30, Gender.MALE);
        Person p2 = new Person("Oscar",31, Gender.MALE);
        Person p3 = new Person("Patrik",33, Gender.MALE);
        Person p4 = new Person("Camilla",32, Gender.FEMALE);

        listOfPersons.add(p1);
        listOfPersons.add(p2);
        listOfPersons.add(p3);
        listOfPersons.add(p4);

        // Iterate over
        for (Person listOfPerson : listOfPersons) {
            System.out.println("Gender: "+listOfPerson.getGender().toString());
        }

        // Use stream to iterate
        listOfPersons.stream().
                forEach(e-> System.out.println("From a stream: "+e.getGender().toString()));


        // Use a stream to filter
        listOfPersons.stream().
                filter(e->e.getGender() == Gender.FEMALE).
                forEach(e-> System.out.println("Filter female Person: "+e.getGender().toString()));


        System.out.println("Before sorting: ");
        printList(listOfPersons);

       // Collections sort by age
        Comparator<Person> comparingByAge = Comparator.comparing(Person::getAge);
        Collections.sort(listOfPersons,comparingByAge);

        System.out.println("After sorting by age: ");
        printList(listOfPersons);

    }

    private void printList(List<Person> listOfPersons) {
        for (Person person : listOfPersons) {
            System.out.println("Name: "+person.getName()+ " Age: "+ person.getAge());
        }
    }

    private void init() {
        System.out.println("Init method");

    }


    public static void main(String[] args) {
        new MainCollections();
    }
}
