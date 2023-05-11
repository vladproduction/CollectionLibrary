package com.MyCollections.app07_Generic;

public interface MyListGeneric<T> {
    public boolean isEmpty();
    public int size();
    public void add(T o);
    public T get(int index);
    public T set(int index, T newObject);
    public void clear();
    public void remove(int index);
}
