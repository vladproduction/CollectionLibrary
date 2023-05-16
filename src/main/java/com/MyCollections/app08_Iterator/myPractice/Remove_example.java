package com.MyCollections.app08_Iterator.myPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remove_example {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");

        System.out.println(stringList);


        System.out.println("------------------");
        Iterator<String> iteratorList = stringList.iterator();
        while (iteratorList.hasNext()){
            String value = iteratorList.next();
            System.out.println(value);
            if("A".equals(value)){
                iteratorList.remove();
                //stringList.remove(0); //ConcurrentModificationException
                //have to use iterator, but not List
            }
        }
        System.out.println("after remove: ------------------");
        System.out.println(stringList);
    }
}
