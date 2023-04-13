package com.app01;

public class Main02 {
    public static void main(String[] args) {

        //data [5];
        Bag bagImpl2 = new BagImpl2();
        boolean flag = bagImpl2.isEmpty();
        System.out.println(flag);
        int sizeRes = bagImpl2.size();
        System.out.println(sizeRes);
        System.out.println("-----add (one element)---------");
        bagImpl2.add(1);
        flag = bagImpl2.isEmpty();
        System.out.println(flag);
        sizeRes = bagImpl2.size();
        System.out.println(sizeRes);
        System.out.println(bagImpl2);
        System.out.println("-----add (five elements)---------");
        bagImpl2.add(2);
        bagImpl2.add(3);
        bagImpl2.add(4);
        bagImpl2.add(5);
        flag = bagImpl2.isEmpty();
        System.out.println(flag);
        sizeRes = bagImpl2.size();
        System.out.println(sizeRes);
        System.out.println(bagImpl2);
        System.out.println("-----add (five +1 element)---------");
        System.out.println("data [5] has to change to data [10]");
        bagImpl2.add(6);
        flag = bagImpl2.isEmpty();
        System.out.println(flag);
        sizeRes = bagImpl2.size();
        System.out.println(sizeRes);
        System.out.println(bagImpl2);

    }
}
