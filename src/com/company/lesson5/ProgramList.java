package com.company.lesson5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramList {

    public static void main(String[] args) {
        String str = "";
        List<Person> personList = Arrays.asList(
                new Person("A1", 23.5, 5),
                new Person("A2", 24.5, 4),
                new Person("A3", 21.5, 3),
                new Person("A1", 25.5, 2),
                new Person("A3", 20.5, 1),
                new Person("A2", 27.5, 6)
        );

        System.out.println(personList);
        List<Person> personList1 = personList.stream()
                .filter(person -> person.getName() == "A1" || person.getName() == "A3")
                .sorted(Comparator.comparing(Person::getName).thenComparingInt(Person::getPosition))
                .collect(Collectors.toList());
        System.out.println(personList1);
        for (Person person : personList1) {
            str += person.getName() + " : " + person.getSalary() + " : " + person.getPosition() + "\n";
            System.out.printf("%s : %s : %s%n", person.getName(), person.getSalary(), person.getPosition());
        }
//        System.out.println(str);
    }


}
