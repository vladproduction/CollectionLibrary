package com.CollectionSummary.app;

import java.util.LinkedList;
import java.util.List;

public class Main01 {


    public static void main(String[] args) {
        //List list = new ArrayList();
        List list = new LinkedList();
        DataProcessor dataProcessor = new DataProcessor();
        dataProcessor.processList(list);
        int size = list.size();
        System.out.println("size="+size);
    }



}
