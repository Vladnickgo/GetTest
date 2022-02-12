package com.company.lesson5;

import java.util.Arrays;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        int totalSize = 0;
        int summary = 0;
        List<Elements> elementsList = Arrays.asList(
                new Elements("", "a1", 4, 4),
                new Elements("", "a2", 4, 4),
                new Elements("", "a3", 4, 4),
                new Elements("", "a4", 0, 3),
                new Elements("", "a5", 4, 4),
                new Elements("", "a6", 4, 4),
                new Elements("", "a7", 0, 3),
                new Elements("", "a8", 4, 3),
                new Elements("", "a9", 4, 3),
                new Elements("", "a10", 4, 3),
                new Elements("", "a11", 0, 2),
                new Elements("", "a12", 4, 2),
                new Elements("", "a13", 4, 2),
                new Elements("", "a14", 0, 2),
                new Elements("", "a15", 4, 2),
                new Elements("", "a16", 4, 2),
                new Elements("", "a17", 0, 1)
        );
        for (int i = 0; i < elementsList.size() - 1; i++) {
            if (elementsList.get(i).getDepth() == elementsList.get(i + 1).getDepth()) {
                totalSize += elementsList.get(i).getSize();
                summary+=elementsList.get(i).getSize();
            } else {
                if (elementsList.get(i).getDepth() > elementsList.get(i + 1).getDepth()) {
                    totalSize += elementsList.get(i).getSize();
                    elementsList.get(i + 1).setSize(totalSize);
                    totalSize = 0;
                }
            }
        }
        elementsList.get(elementsList.size()-1).setSize(summary);
        System.out.println(elementsList);
    }


}
