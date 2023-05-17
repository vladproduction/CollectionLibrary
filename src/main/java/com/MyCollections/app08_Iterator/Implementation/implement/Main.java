package com.MyCollections.app08_Iterator.Implementation.implement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        Iterator<String> stringIterator = list.iterator();
        while (stringIterator.hasNext()){
            String value = stringIterator.next();
            System.out.println(value);
        }
        System.out.println("-------------------------------");

        for (String item: list) {
            System.out.println(item);

        }
    }
}
