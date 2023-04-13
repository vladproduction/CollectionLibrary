package com.app01;

import java.util.Arrays;

public class BagImpl3 implements Bag{
    private Object [] data;
    private int size;

    public BagImpl3() {
        this.data = new Object[5];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    //3)System.arraycopy
    @Override
    public void add(Object object) {
        if(size<data.length){
            Object [] tmp = new Object[10];
            System.arraycopy(data,0,tmp,0,data.length);
            data=tmp;
        }
        data [size] = object;
        size++;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
