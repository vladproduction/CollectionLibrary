package com.MyCollections.app07_Generic.ch02;

import java.util.ArrayList;
import java.util.List;

public class Main_ch02 {
    public static void main(String[] args) {
        List <Sport> sports = new ArrayList();
        sports.add(new Sport());
        sports.add(new Football());
        populateContent(sports);

        System.out.println(sports);
    }
    private static void populateContent(List list){
        list.add("Hello");
    }
}
