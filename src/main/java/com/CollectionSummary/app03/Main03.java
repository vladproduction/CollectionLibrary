package com.CollectionSummary.app03;

import java.util.HashSet;
import java.util.Set;

public class Main03 {

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        //Set set = new LinkedHashSet();
        //Set set = new TreeSet();
        processSet(set);
    }


    public static void processSet(Set<String> set){
        //set.add(10);
        set.add("D");
        set.add("C");
        set.add("B");
        set.add("C");
        //set.add(11);
        set.add("A");
        System.out.println(set);
    }

}
