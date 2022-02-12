package com.company.testMap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        Map<Integer, Integer> map = Map.of(0, 5,
                1, 1,
                2, 2,
                3, 3,
                4, 4);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 5);

        Optional<Integer> sum = map.values().stream()
                .reduce((left, right) -> left + right);

        sum.ifPresent(System.out::println); //output 11

    }
}
