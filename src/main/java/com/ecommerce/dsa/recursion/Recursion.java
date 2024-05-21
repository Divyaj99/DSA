package com.ecommerce.dsa.recursion;

public class Recursion {
    public static void main(String[] args) {
        //print n numbers
        printnumber(5);
    }

    private static void printnumber(int n) {
        if (n == 0) return;
        printnumber(n -1);
        System.out.println(n);

    }
}
