package com.app01;

import java.util.Arrays;

public class BagImpl implements Bag{
    private Object [] data;
    private int size;
    private int capacity;

    public BagImpl() {
        this(10);

    }

    public BagImpl(int capacity) {
        this.capacity = capacity;
        this.data = new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }
    //2) Arrays.copyOf
    //3)System.arraycopy
    @Override
    public void add(Object object) {
        if(size == data.length){
            Object [] tmp = new Object[data.length*2];
            for(int i = 0; i<data.length;i++){
                tmp [i] = data [i];
            }
            data=tmp;
        }
        data [size] = object;
        size++;
    }

    public String toString(){
        return Arrays.toString(data);
    }


}
