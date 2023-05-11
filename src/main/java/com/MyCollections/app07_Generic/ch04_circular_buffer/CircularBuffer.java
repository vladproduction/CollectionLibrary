package com.MyCollections.app07_Generic.ch04_circular_buffer;

public class CircularBuffer {
    private Object [] data;
    private int head = 0;
    private int tail = 0;

    public CircularBuffer(int size){
        data = new Object[size];
    }

    public boolean offer(Object o){
        if(data[tail]!=null){
            return false;
        }
        data[tail] = o;
        tail = next(tail);
        return true;
    }

    public Object pool(){
        Object value = data[head];
        if (value!=null){
            data[head] = null;
            head = next(head);
        }
        return value;
    }

    private int next(int index){
        return (index+1) % data.length;
    }
}
