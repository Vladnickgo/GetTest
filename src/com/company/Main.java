package com.company;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new TreeMap<>();
        int keyValue;
        String value;
        for (int i = 0; i < 100; i++) {
            keyValue = (int) round(random() * 100);
            value = "";
            for (int j = 0; j < 10 ; j++) {
                char с = (char) round(random() * 25 + 65);
                value += с;
            }
            myMap.put(keyValue, value);
        }
        System.out.println(myMap);
//        for (Integer integer : myMap.keySet()) {
//            System.out.println(integer+"\t = \t"+myMap.get(integer));
//
//        }
        System.out.println();
    }
}
