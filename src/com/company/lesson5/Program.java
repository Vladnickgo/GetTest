package com.company.lesson5;

public class Program {
    @FunctionalInterface
    public interface IOperation {
        int oper(int x, int y);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 120;
        IOperation sumOp = (x, y) -> x + y;
        IOperation mulOp = (x, y) -> x * y;
        IOperation diffOp = (x, y) -> x - y;
        IOperation divOp = (x, y) -> x / y;
        System.out.println(sumOp.oper(a, b));
        System.out.println(mulOp.oper(a, b));
        System.out.println(diffOp.oper(a, b));
        System.out.println(divOp.oper(a, b));

    }
}
