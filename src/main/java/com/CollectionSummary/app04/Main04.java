package com.CollectionSummary.app04;

import java.util.Map;
import java.util.TreeMap;

public class Main04 {

    public static void main(String[] args) {
        //Map<String, Integer> map = new HashMap();
        //Map<String, Integer> map = new LinkedHashMap();
        Map<String, Integer> map = new TreeMap();
        processData(map);
    }

    private static void processData(Map<String, Integer> map){
        map.put("scheva", 7);
        map.put("rebrov", 11);
        System.out.println(map);
    }


}
