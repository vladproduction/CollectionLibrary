package com.MyCollections.app08_Iterator.myPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remove_example_IllegalStateException {
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
//            String value = iteratorList.next();
//            System.out.println(value);
            iteratorList.remove();  //without .next(); -->IllegalStateException
        }
        System.out.println("after remove: ------------------");
        System.out.println(stringList);
    }
}
