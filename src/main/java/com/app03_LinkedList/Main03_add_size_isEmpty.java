package com.app03_LinkedList;

import com.MyList;

public class Main03_add_size_isEmpty {
    public static void main(String[] args) {
        MyList linkedList = new MyLinkedListImpl();
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());
        linkedList.add("a");
        linkedList.add("c");
        linkedList.add("d");
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());


    }
}
