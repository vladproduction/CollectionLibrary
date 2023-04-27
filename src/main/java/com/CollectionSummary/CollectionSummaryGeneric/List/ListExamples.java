package com.CollectionSummary.CollectionSummaryGeneric.List;


import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        List list = new ArrayList();
        //List list = new LinkedList();

        list.add("A");
        list.add(2);
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add(23);

        System.out.println("size="+list.size()+"; list empty?-"+list.isEmpty());
        System.out.println("all elements in list:"+list);
        System.out.println("give item from place="+list.get(1));
        int size = list.size();
        Object itemOnlastPlace = list.get(size-1);
        System.out.println("itemOnlastPlace="+itemOnlastPlace);



    }

}
