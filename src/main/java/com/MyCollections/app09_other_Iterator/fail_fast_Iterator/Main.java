package com.MyCollections.app09_other_Iterator.fail_fast_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList();
        listString.add("a");
        listString.add("b");
        listString.add("c");
        listString.add("d");

        System.out.println("ListIterator<String>: ");
        ListIterator<String> listIterator = listString.listIterator();
        while (listIterator.hasNext()){
            String item = listIterator.next();
            if ("c".equals(item)){
                listIterator.remove();
            }
            System.out.println(item);
        }
        System.out.println(listString); //now we se: deleted "c"

        System.out.println("-------------------");
        for (String item: listString) {
            if("c".equals(item)){
                listString.remove(2);

                System.out.println(item);
            }
        }
    }
}
