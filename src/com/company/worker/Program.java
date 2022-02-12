package com.company.worker;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Worker worker = new Worker("Qwe", 23, 4567, "a1");
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Asd", 42, 654, "Q"));
        workers.add(new Worker("Bsd", 45, 656, "A"));
        workers.add(new Worker("Esd", 32, 651, "A"));
        System.out.println(workers);
        Map<Integer, List<Worker>> map = new HashMap<>();
        for (Worker worker1 : workers) {
            map.computeIfAbsent(worker1.getAge(), k -> new ArrayList<>()).add(worker1);
        }
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map);

//
//        Map<String, Set<Worker>> map2 = workers.stream()
//                .collect(Collectors.groupingBy(Worker::getPosition, Collectors.toSet()));
//        System.out.println(map2);

        Map<String, Double> map3 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition, Collectors.averagingDouble(k->k.getSalary())));
        System.out.println(map3);

    }

}
