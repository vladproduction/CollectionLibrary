package com.MyCollections.app08_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        Iterator<String> stringIterator = list.iterator();
        while (stringIterator.hasNext()){
            //IllegalStateException -->> stringIterator.remove();
            //remove удаляет возвращаемый элемент;
            String value = stringIterator.next();
            System.out.println(value);
            stringIterator.remove();

        }
        System.out.println("-------------------------------");
        System.out.println(list);

    }
}

/*
* Iterator - это обьект, который позволяет проходится по каждому элементу коллекции.
*   Содержит методы:
* -boolean hasNext(); возвращает true если есть в коллекции следующий элемент;
* -<example String> next(); уже идет к следующему
* -remove(); возвращает Обьект <> ; удаляет последний элемент который нам вернул
*    метод некст; для того чтобы удалить-сначала нужно получить элемент
*    с помощью метода некст, вызов ремув без вызова некст, даст рантайм*/
