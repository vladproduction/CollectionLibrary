package com.app03;

/*
* working with methods:
    get();
    set(int index);
 */
public class Main_get_set {
    public static void main(String[] args) {
        MyList list = new MyListImpl();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println("---------");
        list.set(0,"AA");
        System.out.println(list);

    }
}
