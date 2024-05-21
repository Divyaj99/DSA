package com.ecommerce.dsa.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "divya";
        //char[] charArray = str.toCharArray();
        String rev = "";
        boolean ans = false;
        for (int i = str.length()-1; i >=0  ; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
        if (str.equals(rev)) {
            ans = true;
        }
        System.out.println(ans);
    }
}
