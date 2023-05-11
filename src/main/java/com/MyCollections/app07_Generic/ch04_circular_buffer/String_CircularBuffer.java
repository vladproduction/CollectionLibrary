package com.MyCollections.app07_Generic.ch04_circular_buffer;

public class String_CircularBuffer {
    private String [] data;
    private int head = 0;
    private int tail = 0;

    public String_CircularBuffer(int size){
        data = new String[size];
    }

    public boolean offer(String o){
        if(data[tail]!=null){
            return false;
        }
        data[tail] = o;
        tail = next(tail);
        return true;
    }

    public String pool(){
        String value = data[head];
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
