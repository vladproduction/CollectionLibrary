package com.CollectionSummary.app02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main02 {


    public static void main(String[] args) {
        List<Object> list = new LinkedList();
        list.add("A");
        list.add(1);

        List<String> list2 = new LinkedList();
        list2.add("A");
        //list2.add(100);


        List<Integer> list3 = new LinkedList();
        //list3.add("A");
        list3.add(100);
        int size = list.size();
        System.out.println("size="+size);

        System.out.println("-------------Non generic-----------------");
        List personList = new ArrayList();
        Person p1 = new Person();
        p1.age=1;
        p1.name="Name1";
        for(Object item: personList){
            Person p = (Person)item;
        }


        Object firstItem = personList.get(0);
        //Person firstItem = (Person) personList.get(0);

        System.out.println("--------------Generic--------------------");
        List<Person> personList2 = new ArrayList();
        personList2.add(p1);
        Person firstItem2 = personList2.get(0);
        for(Person item: personList2){

        }






    }



}
