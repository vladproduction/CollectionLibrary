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

    }
}
