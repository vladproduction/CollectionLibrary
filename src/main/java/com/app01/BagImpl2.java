package com.app01;

import java.util.Arrays;

public class BagImpl2 implements Bag{
    private Object [] data;
    private int size;

    public BagImpl2() {
        this.data = new Object[5];
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
    @Override
    public void add(Object object) {
        if(size<data.length){
            Object [] tmp = Arrays.copyOf(data,10);
            data=tmp;
        }
        data [size] = object;
        size++;
    }

    public String toString(){
        return Arrays.toString(data);
    }
}
