package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        TwoWayLinkedList<String> list = new TwoWayLinkedList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("a");
        list.add("b");
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());


/*
        for (String x: list
             ) {
            System.out.println(x);
        }
*/
    }
}
