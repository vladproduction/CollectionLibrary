package com.MyCollections.app08_Iterator.My_Iterator_2;

import com.MyCollections.app08_Iterator.My_Iterator.MyListIterator;

import java.util.Iterator;

public class Main_ListImpl_2 {
    public static void main(String[] args) {
        //have to use class=class, not an interface=class
        MyListIteratorImpl_2<String> list = new MyListIteratorImpl_2<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> iteratorDefault = list.iterator();
        while (iteratorDefault.hasNext()){
            String value = iteratorDefault.next();
            System.out.println(value);
        }
        System.out.println("-------------------");
        for (String item: list) {
            System.out.println(item);
        }
    }
}
