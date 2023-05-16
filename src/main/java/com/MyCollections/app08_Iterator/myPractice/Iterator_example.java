package com.MyCollections.app08_Iterator.myPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_example {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");

        System.out.println(stringList);
        System.out.println("------------------");
        for (String item: stringList){
            System.out.println(item);
        }
        System.out.println("------------------");
        Iterator<String> iteratorList = stringList.iterator();
        while (iteratorList.hasNext()){
            String value = iteratorList.next();
            System.out.println(value);
        }
    }
}
