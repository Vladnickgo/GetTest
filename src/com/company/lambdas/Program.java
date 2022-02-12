package com.company.lambdas;

import java.util.Map;

public class Program {

    public static void main(String[] args) {
//        int val1 = 100, val2 = 200;
//
//        Operation operation = new Operation() {
//            @Override
//            public double getOperation(double v1, double v2) {
//                return v1 + v2;
//            }
//        };
//        System.out.println(operation.getOperation(1.0, 2.0));
//        Operation lambda = Double::sum;
//        System.out.println(lambda.getOperation(1.0, 2.5));
//
//        Printer printer = string -> System.out.println(string);
//        printer.println("Hello world!!!");
//
//        Factorial factorial = value -> {
//            int rez = 1;
//            for (int j = 1; j <= value; j++) rez *= j;
//            return rez;
//        };
//        System.out.println(factorial.getResult(5));
//        Operat operat = () -> {
//            return val1 + val2;
//        };
//        System.out.println(operat.getResult());

        Map<String,Integer>map = null;
        map.put("Asd",5);
        System.out.println(map.values());


    }
}
