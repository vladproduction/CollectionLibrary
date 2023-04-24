package com.app03.linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
        boolean isEmpty = myLinkedList.isEmpty();
        System.out.println(isEmpty);
        int sizeRez = myLinkedList.size();
        System.out.println(sizeRez);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        myLinkedList.set(0,"AAA");
        sizeRez = myLinkedList.size();
        System.out.println(sizeRez);
        System.out.println(myLinkedList.get(0));
        myLinkedList.set(2,"CCC");
        Object oldValue = myLinkedList.set(1,"BBB");
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        sizeRez = myLinkedList.size();
        System.out.println(sizeRez);
        System.out.println(oldValue);
        myLinkedList.clear();
        sizeRez = myLinkedList.size();
        System.out.println(sizeRez);



    }
}
