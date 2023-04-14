package com.app02;

import com.app01.Bag;

public interface MyList extends Bag {
    //don`t need to implements methods from Bag, because we extends from it

    public Object get(int index);
    public Object set(int index, Object newItem);
    public void clear();
    public void remove(int index);
}
