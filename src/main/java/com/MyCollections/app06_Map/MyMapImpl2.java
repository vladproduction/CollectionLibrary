package com.MyCollections.app06_Map;

import java.util.ArrayList;
import java.util.List;

public class MyMapImpl2 implements MyMap{

    private List<Entry> [] data;
    private int capacity;
    private int size;

    public MyMapImpl2() {
        this(6);
    }

    public MyMapImpl2(int capacity) {
        this.capacity = capacity;
        data = new ArrayList [capacity];
        for (int i = 0; i < data.length; i++) {
            data[i] = new ArrayList();
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public Object put(Object key, Object value) {
        int numberBucket = findIndexOfBucket(key);
        List<Entry> bucketList = data[numberBucket];
        for (Entry entry: bucketList) {
            if(key.equals(entry.getKey())){
                Object oldValue = entry.getValue();
                entry.setValue(value);
                return oldValue;
            }
        }
        Entry newItem = new Entry(key,value);
        bucketList.add(newItem);
        size++;
        return null;
    }

    private int findIndexOfBucket(Object key){
        int hashKey = key.hashCode();
        int bucketIndex = hashKey % data.length;
        return Math.abs(bucketIndex);
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void clear() {

    }
}
