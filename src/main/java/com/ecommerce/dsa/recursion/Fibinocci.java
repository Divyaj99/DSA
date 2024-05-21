package com.ecommerce.dsa.recursion;

public class     Fibinocci {
    public static void main(String[] args) {
        System.out.println(fib(0));
    }

    private static int fib(int n) {
        if (n == 2)
            return 1;
        if (n == 1) {
            return 0;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
