package com.app01;

public class Main {
    public static void main(String[] args) {
        Bag bagImpl = new BagImpl();
        boolean flag = bagImpl.isEmpty();
        System.out.println(flag);
        int sizeRez = bagImpl.size();
        System.out.println(sizeRez);
        bagImpl.add("a");
        flag = bagImpl.isEmpty();
        System.out.println(flag);
        sizeRez = bagImpl.size();
        System.out.println(sizeRez);
        bagImpl.add("b");
        System.out.println(bagImpl);
        bagImpl.add("c");
        bagImpl.add("d");
        bagImpl.add("e");
        bagImpl.add("f");
        bagImpl.add("g");
        bagImpl.add("h");
        bagImpl.add("i");
        bagImpl.add("j");
        sizeRez = bagImpl.size();
        System.out.println(sizeRez);
        System.out.println(bagImpl);
        bagImpl.add("k");
        sizeRez = bagImpl.size();
        System.out.println(sizeRez);
        System.out.println(bagImpl);
    }
}
