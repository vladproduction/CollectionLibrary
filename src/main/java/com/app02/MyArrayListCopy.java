package com.app02;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayListCopy implements MyList{
    private Object [] data; // array
    private int size; // amount items in array
    private int capacity; // capacity of array



    public MyArrayListCopy() {
        this(5);
    }

    public MyArrayListCopy(int capacity) {
        this.data = new Object[capacity];
        this.capacity = capacity;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(Object object) {
        if(size>=data.length){ //если машин больше чем парковочных мест в текушем гараже, то:
            Object [] tmp = new Object[data.length*2]; // увеличиваем гараж
            System.arraycopy(data,0,tmp,0,data.length); //перегоняем машины
            data=tmp; //говорим что это теперь новый гараж
        }
        data[size] = object; //добавляем обьекты в текущий гараж (если размер гаража позволяет)
        size++; //увеличиваем показатель (количество обьектов) в гараже на текущий момент

    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public Object set(int index, Object newItem) { //место на парковке, новая машина
        Object currentItem = get(index); //берем обьект по индексу
        data[index] = newItem; //новый обьект определяем(назначаем) для индекса текущего обьекта
        return currentItem; //возвращаем указанный по индексу обьект
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i]=null;
//            Object [] tmp = new Object[data.length];
//            if (data[i] != null){
//                System.arraycopy(data,0,tmp,0,data.length);
//                data=tmp;
//            }
        }
        size=0;
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
    public String toString() {
        String text = "[";
        for (int i=0;i<size;i++){
            text=text+data[i];
            if(i!=size-1){
                text=text+",";
            }
        }
        text = text+"]";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null){
            return false;
        }
        if (o==this){
            return true;
        }
        if (o.getClass()==MyArrayListCopy.class){
            MyArrayListCopy otherList = (MyArrayListCopy) o;
            Object[] otherData = otherList.data;
            return Arrays.equals(data,otherData);
        }
        return false;
    }

    @Override
    public int hashCode() {

        return Arrays.hashCode(data);
    }
}
