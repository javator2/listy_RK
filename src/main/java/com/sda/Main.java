package com.sda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<Integer>();
        list.add(2);
        list.add(2);
        list.add(12);
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(23);
        list.add(72);
        list.add(92);
        list.add(52);
        list.add(134);
        list.add(243);

        for (Integer list1 : list){
            System.out.println(list1);
        }


    }
}
