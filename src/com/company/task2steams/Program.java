package com.company.task2steams;

import javax.swing.*;
import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>();
        list.add(new String[]{"Bcdqwe"});
        list.add(new String[]{"Asddddd", "Bcdqwe", "Asd"});
        list.add(new String[]{"Asddddd", "Bcdqwe", "Asd"});
        list.add(new String[]{"Asddddd", "Bcdqwe", "Asd"});
        list.add(new String[]{"Bcdqwe", "Bcdqwe", "Bcdqwe", "Bcdqwe"});
        list.add(new String[]{"Asddddd", "Bcd", "Bcfg"});
        list.add(new String[]{"EEEE", "EEEE", "EEEE", "EEEe", "Asddddd", "aaa", "aaa", "aaa"});
        list.add(new String[]{"bbb", "bbb", "bbb", "ddd", "ddd", "ddd", "ddd", "ddd"});
        List<String> collect = list.stream().flatMap(Arrays::stream).collect(Collectors.toList());
        Map<String, List<String>> collect1 = collect
                .stream()
                .collect(Collectors.groupingBy(String::toString));
        String collect2 = collect1
                .entrySet()
                .stream()
                .filter(k -> k.getKey().length() > 2)
                .sorted((k1, k2) -> {
                    return k1.getValue().size() == k2.getValue().size() ? k1.getKey().toLowerCase().compareTo(k2.getKey().toLowerCase()) : (k1.getValue().size() - k2.getValue().size()) < 1 ? 1 : -1;
                })
                .filter(k -> k.getValue().size() > 1).map(k -> {
                    return k.getKey().toLowerCase() + " - " + k.getValue().size() + '\n';
                })
                .collect(Collectors.joining());
        System.out.println(collect2);
    }
}
