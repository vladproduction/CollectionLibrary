package com.app02;


public class Main {
    public static void main(String[] args) {
        MyList myList = new MyArrayList();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        int sizeRez = myList.size();
        System.out.println(sizeRez);
        boolean flag = myList.isEmpty();
        System.out.println(flag);
        System.out.println(myList);
        Object item = myList.get(3);
        System.out.println(item);
        myList.set(1,"t");
        System.out.println(myList);
        System.out.println("-------");
        myList.clear();
        System.out.println("null?: "+myList);
        sizeRez = myList.size();
        System.out.println("size= "+sizeRez);
        flag = myList.isEmpty();
        System.out.println("isEmpty= "+flag);
    }
}
