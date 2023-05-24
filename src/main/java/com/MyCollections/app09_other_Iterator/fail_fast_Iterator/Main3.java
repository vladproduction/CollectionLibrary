package com.MyCollections.app09_other_Iterator.fail_fast_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList();
        listString.add("a");
        listString.add("b");
        listString.add("c");
        listString.add("d");

//        for (String item: listString){
//            System.out.println(item);
//            if("b".equals(item)){
//                listString.remove(1);
//            }
//        }
//        System.out.println(listString);
        //Iterator:
        Iterator<String> listIterator = listString.iterator();
        while (listIterator.hasNext()){
            String value = listIterator.next();
            System.out.println(value);
            if ("b".equals(value)){
                //listIterator.remove();
                listString.remove(1);
            }
        }
        System.out.println(listString);
    }
}
