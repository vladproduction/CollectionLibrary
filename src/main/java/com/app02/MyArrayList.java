package com.app02;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList implements MyList {
    private Object[] data;
    private int size; //amount items
    private int capacity;

    public MyArrayList() {
        this(5);
    }

    public MyArrayList(int capacity) {
        this.data = new Object[capacity];
        this.capacity = capacity;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(Object object) {
        if (size >= data.length) {
            Object[] tmp = new Object[data.length * 2];
            System.arraycopy(data, 0, tmp, 0, data.length);
            data = tmp;
        }
        data[size] = object;
        size++;
    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public Object set(int index, Object newItem) {
        Object currentValue = get(index);
        data[index] = newItem;
        return currentValue;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size-1; i++) {
            Object rightValue = data[i+1];
            data[i] = rightValue;
        }
        data[size-1]=null;
        size--;
    }

    @Override
    public void clear() { //while
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size=0;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    @Override
    public boolean equals(Object o) {
        if(o==null){
            return false;
        }
        if (o==this){
            return true;
        }
        if (o.getClass()==MyArrayList.class){
            MyArrayList otherList = (MyArrayList) o;
            Object [] otherData = otherList.data;
            return Arrays.equals(data,otherData);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }
}
