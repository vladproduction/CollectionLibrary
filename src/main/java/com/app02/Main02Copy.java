package com.app02;

public class Main02Copy {
    public static void main(String[] args) {
        MyList list = new MyArrayListCopy();
        list.add("A");
        list.add("B");
        list.add("C");
        boolean flag = list.isEmpty();
        System.out.println(flag);
        int listRez = list.size();
        System.out.println(listRez);
        System.out.println(list);
        System.out.println("trying to add more items in array");
        list.add("D");
        listRez = list.size();
        System.out.println(listRez);
        System.out.println(list);
        //System.out.println("ArrayIndexOutOfBoundsException");
        //have to modify add() method
        //now our garage has been changed, so we can add more items
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");
        list.add("K");

        //let`s see how changed size, and print toString()
        listRez = list.size();
        System.out.println(listRez);
        System.out.println(list);
//        11
//        [A, B, C, D, E, F, G, H, I, J, K, null] //in case of critical (data.length*2) every time

        // method get(int index):
        Object getItem = list.get(0);
        System.out.println(getItem);
        //we have to look for item existing in bounds of array, otherwise --> Exception

        // method set(int index, Object newItem):
        list.set(11,"L");
        System.out.println(list); //[A, B, C, D, E, F, G, H, I, J, K, L]
        System.out.println(listRez); //11

        System.out.println("-----------------------");
        MyList list2 = new MyArrayListCopy();
        list2.add("A");
        list2.add("B");
        list2.add("C");

        System.out.println(list2); //[A, B, C]
        System.out.println(list2.size()); //3
        //list2.clear();
        System.out.println(list2);// []
        System.out.println(list2.size()); //0
        System.out.println("remove on action: ");
        list2.remove(1);
        System.out.println(list2);
        System.out.println(list2.size());







    }
}
