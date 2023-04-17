package com.app02;

import java.util.Arrays;

public class Main_hash_equals {
    public static void main(String[] args) {
        MyList list1 = new MyArrayListCopy();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        MyList list2 = new MyArrayListCopy();
        list2.add("A");
        list2.add("B");
        list2.add("C");

        System.out.println(list1.hashCode());
        System.out.println(list2.hashCode());
        System.out.println(list1.equals(list2));

        System.out.println("-------сравнение массива как обьекта (ссылок)-----------");

        Object[] data1 = new Object[]{"a","b","c"};
        Object[] data2 = new Object[]{"a","b","c"};
        System.out.println(data1.hashCode());
        System.out.println(data2.hashCode());
        System.out.println(data1.equals(data2));

        System.out.println("-----сравнение по наполняемости(то что внутри) в массива-------");
        System.out.println(Arrays.hashCode(data1));
        System.out.println(Arrays.hashCode(data2));
        System.out.println(Arrays.equals(data2,data1));

    }
}
