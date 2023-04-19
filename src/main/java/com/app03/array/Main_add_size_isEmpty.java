package com.app03.array;
    /*
* working with methods:
*   isEmpty();
*   size();
*   add(Object o);
*
* how constructor creating:
*   -capacity in bounds (5)
*   -capacity out of bounds, so if bench settings start
*
* modify toString, so it dsn`t print "null"   */

import com.app03.MyList;

public class Main_add_size_isEmpty {
    public static void main(String[] args) {
        MyList list = new MyListImpl();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("------");
        list.add("F");
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list);
    }
}