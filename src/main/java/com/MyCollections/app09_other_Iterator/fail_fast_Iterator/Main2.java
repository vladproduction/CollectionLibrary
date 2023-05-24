package com.MyCollections.app09_other_Iterator.fail_fast_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main2 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList();
        listString.add("a");
        listString.add("b");
        listString.add("c");
        listString.add("d");
        listString.add("e");



        System.out.println("Iterator<String>: ");
        Iterator<String> listIterator = listString.iterator();
        while (listIterator.hasNext()){
            String item = listIterator.next();
            if ("b".equals(item)){
                listString.remove(2);
            }
            System.out.println(item);

        }
        System.out.println(listString);
        System.out.println("-------------------");
        for (String item: listString) {
            if("c".equals(item)){
                listString.remove(item); //it`s ConcurrentModificationException
                //versions are not same; iteratorVersion= 4 ;version=5
                System.out.println(item);
            }
        }
        System.out.println(listString);
    }
}
