package com.company.functionalInterfaces;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
//        Predicate<Integer> isZero = value -> value == 0;
//        System.out.println(isZero.test(4));
//        System.out.println(isZero.test(0));
//
//        Consumer<String> print = System.out::println;
//        print.accept("Hello!!!");
//
//        Function<Integer, Double> function = Double::valueOf;
//        System.out.println(function.apply(5));
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("Asd", 5);
//        map.put("Assd", 5);
//        System.out.println(map.values());
//        if(map.containsKey("Asd")){
//            map.put("Asd",map.get("Asd")*2);
//        };
//        System.out.println(map);
        List<Map<String, Integer>> resultList =new ArrayList<>();
        resultList.add(new HashMap (Map.of("Phalanxing", 51.666666666666664,
                "Tercioing", 37.666666666666664,
                "Wedging", 40.333333333333336,
                "Shieldwalling", 75.66666666666667
        )));
        resultList.add(new HashMap (Map.of("Lab 2. War and Peace", 80.66666666666667,
                "Lab 1. Figures", 77.66666666666667,
                "Lab 3. File Tree", 81.0
        )));
        resultList.add(new HashMap (Map.of("Lab 2. War and Peace", 67.0,
                "Lab 1. Figures", 85.66666666666667,
                "Lab 3. File Tree", 68.33333333333333
        )));
        resultList.add(new HashMap (Map.of("Phalanxing", 51.666666666666664,
                "Tercioing", 37.666666666666664,
                "Wedging", 40.333333333333336,
                "Shieldwalling", 75.66666666666667
        )));
        resultList.add(new HashMap (Map.of("Phalanxing", 44.0,
                "Tercioing", 47.333333333333336,
                "Wedging", 33.333333333333336,
                "Shieldwalling", 83.0
        )));


        System.out.println(resultList);
    }
}
