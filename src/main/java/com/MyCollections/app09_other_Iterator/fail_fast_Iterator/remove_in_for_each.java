package com.MyCollections.app09_other_Iterator.fail_fast_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class remove_in_for_each {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("list:start "+list);

        Iterator<String> valueList = list.iterator();
        for (Iterator<String> it = valueList; it.hasNext(); ) {
            String value = it.next();
            if("e".equals(value)){
                valueList.remove();
                //list.remove(2);     //--> ConcurrentModificationException
            }
        }
        System.out.println("list:finish "+list);
    }
}
