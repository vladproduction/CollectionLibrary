package com.MyCollections.app07_Generic.ch04_circular_buffer;

public class Generic_CircularBuffer<T> {
    private T [] data;
    private int head = 0;
    private int tail = 0;

    public Generic_CircularBuffer(int size){
        data = (T[]) new Object[size];
    }

    public boolean offer(T o){
        if(data[tail]!=null){
            return false;
        }
        data[tail] = o;
        tail = next(tail);
        return true;
    }

    public T pool(){
        T value = data[head];
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
