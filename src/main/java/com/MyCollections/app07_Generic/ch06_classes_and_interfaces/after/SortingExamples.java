package com.MyCollections.app07_Generic.ch06_classes_and_interfaces.after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExamples
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Person1", 1);
        Person person2 = new Person("Person2", 2);
        Person person3 = new Person("Person3", 3);

        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Collections.sort(personList, new AgeComparator());

        System.out.println(personList);

        Collections.sort(personList, new Reverser<>(new AgeComparator()));

        System.out.println(personList);
    }

}
