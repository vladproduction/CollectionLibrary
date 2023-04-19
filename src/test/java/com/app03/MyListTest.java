package com.app03;

import com.app03.array.MyListImpl;
import org.junit.Assert;
import org.junit.Test;

public class MyListTest {

    @Test
    public void equalsHashCodeTest(){
        MyListImpl list1 = new MyListImpl();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        MyListImpl list2 = new MyListImpl();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");


        int hash1 = list1.hashCode();
        int hash2 = list2.hashCode();
        Assert.assertTrue(hash1==hash2);
        //Assert.assertSame(hash1,hash2);//тоже самое что и предыдущий
        Assert.assertTrue(list1.equals(list2));
        Assert.assertTrue(list2.equals(list1));
        //Assert.assertEquals(list1,list2);//тоже самое что и предыдущий
        list2.add("EE");
        hash1 = list1.hashCode();
        hash2 = list2.hashCode();
        Assert.assertFalse(hash1==hash2);
        Assert.assertFalse(list1.hashCode()==list2.hashCode()); //тоже но одна строка
        Assert.assertFalse(list1.equals(list2));

    }

    @Test
    public void apiTest(){  //api : все публичные методы доступные этому листу
        MyListImpl list = new MyListImpl();
        Assert.assertTrue(list.isEmpty());
        Assert.assertTrue(list.size()==0);
        list.add("A");
        list.add("B");
        list.add("C");
        Assert.assertFalse(list.isEmpty());
        Assert.assertTrue(list.size()==3);
        Assert.assertTrue("A".equals(list.get(0)));
        Assert.assertTrue("B".equals(list.get(1)));
        Assert.assertTrue("C".equals(list.get(2)));

        Object oldValue = list.set(0,"a");
        Assert.assertTrue("a".equals(list.get(0)));
        Assert.assertEquals("A",oldValue); //проверка старого элемента
        Assert.assertTrue(list.size()==3);

        oldValue = list.set(1,"b");
        Assert.assertTrue("b".equals(list.get(1)));
        Assert.assertEquals("B",oldValue); //проверка старого элемента
        Assert.assertTrue(list.size()==3);

        oldValue = list.set(2,"c");
        Assert.assertTrue("c".equals(list.get(2)));
        Assert.assertEquals("C",oldValue); //проверка старого элемента
        Assert.assertTrue(list.size()==3);

        list.remove(0);
        Assert.assertTrue(list.size()==2);
        Assert.assertTrue("b".equals(list.get(0)));
        Assert.assertTrue("c".equals(list.get(1)));

        list.clear();
        Assert.assertTrue(list.size()==0);
        Assert.assertTrue(list.isEmpty());
    }
}
