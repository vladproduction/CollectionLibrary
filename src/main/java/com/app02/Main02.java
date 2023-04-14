package com.app02;

public class Main02 {
    public static void main(String[] args) {
        MyList list = new MyArrayList(5);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
//        System.out.println(list.size());
//        System.out.println(list);
//        list.clear();
//        System.out.println("after clear(): "+list.size());
//        System.out.println(list);
//        System.out.println("--------");
        list.add("F");
        list.add("J");
        list.add("H");
//        System.out.println(list.size());
//        System.out.println(list);
        System.out.println("----remove(2)----");
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list);
    }
}
