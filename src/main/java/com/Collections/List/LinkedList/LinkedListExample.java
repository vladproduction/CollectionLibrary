package com.Collections.List.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<String>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");
        System.out.println("start stringList:"+stringList);
        stringList.remove("e");
        System.out.println("after remove stringList:"+stringList);
        stringList.add(4,"new e");
        System.out.println("after add(new e) stringList:"+stringList);

    }
}
