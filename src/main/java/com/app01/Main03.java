package com.app01;

public class Main03 {
    public static void main(String[] args) {

        //data [5];
        Bag bagImpl3 = new BagImpl3();
        boolean flag = bagImpl3.isEmpty();
        System.out.println(flag);
        int sizeRez = bagImpl3.size();
        System.out.println(sizeRez);
        System.out.println(bagImpl3);
        System.out.println("-----add (one element)---------");
        bagImpl3.add(1);
        flag = bagImpl3.isEmpty();
        System.out.println(flag);
        sizeRez = bagImpl3.size();
        System.out.println(sizeRez);
        System.out.println(bagImpl3);
        System.out.println("-----add (five elements)---------");
        bagImpl3.add(2);
        bagImpl3.add(3);
        bagImpl3.add(4);
        bagImpl3.add(5);
        flag = bagImpl3.isEmpty();
        System.out.println(flag);
        sizeRez = bagImpl3.size();
        System.out.println(sizeRez);
        System.out.println(bagImpl3);
        System.out.println("-----add ( +1 element)---------");
        System.out.println("data [5] has to change to data [10]");
        bagImpl3.add(6);
        flag = bagImpl3.isEmpty();
        System.out.println(flag);
        sizeRez = bagImpl3.size();
        System.out.println(sizeRez);
        System.out.println(bagImpl3);

            /*System.arrayCopy(from, fromIndex, to, toIndex, count);
        from - массив, который копируем
        to - массив в которой копируем
        fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
        toIndex - индекс в массиве to начиная с которого вставляем элементы
        count - количество элементов которые берем из массива from и вставляем в массив to
            Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы.*/

        System.out.println("-----add ( +3 more element)---------");
        System.out.println(sizeRez+" = data [] (before):"+bagImpl3);
        bagImpl3.add(7000);
        bagImpl3.add(8000);
        bagImpl3.add(9000);
        sizeRez = bagImpl3.size();
        System.out.println(sizeRez+" = data [] (after) :"+bagImpl3);
    }
}
