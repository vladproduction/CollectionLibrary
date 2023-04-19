package com.app03.array;

import com.app03.MyList;

import java.util.Arrays;

/*
* working with methods:
    hashCode overridden;
    equals overridden;
 */
public class Main_hashCode_equals {
    public static void main(String[] args) {
        MyList list = new MyListImpl();
        list.add("Apple");
        list.add("Banana");
        list.add("Citrus");
        list.add("Grapefruit");
        list.add("Pamela");

        MyList list1 = new MyListImpl();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        System.out.println(list.hashCode());
        System.out.println(list1.hashCode());
        System.out.println(list.equals(list1));

        System.out.println("----------");
        Object[] data1 = new Object[]{"a","b","c"};
        Object[] data2 = new Object[]{"a","b","c"};
        System.out.println(data1.hashCode());
        System.out.println(data2.hashCode());
        System.out.println(data1.equals(data2));

        System.out.println("----------");
        System.out.println(Arrays.hashCode(data1));
        System.out.println(Arrays.hashCode(data2));
        System.out.println(Arrays.equals(data2,data1));

        System.out.println("----inside different items---");
        Object[] data3 = new Object[]{"A","B","C"};
        Object[] data4 = new Object[]{"a","b","c"};
        System.out.println(data3.hashCode());
        System.out.println(Arrays.toString(data3));
        System.out.println(data4.hashCode());
        System.out.println(Arrays.toString(data4));
        System.out.println(data3.equals(data4));
        System.out.println(Arrays.equals(data3,data4));


    }
}
