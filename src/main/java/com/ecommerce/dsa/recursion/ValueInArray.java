package com.ecommerce.dsa.recursion;

public class ValueInArray {
    public static void main(String[] args) {
        findNo(6);
    }
    private static void findNo(int n) {
        int[] arr = {34,6,23,12,7};
        boolean flag = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                flag = true;
                index = i;
            }
        }
        if (flag == true) {
            System.out.println("val is present at " + index);

        } else  System.out.println("val is not present");
    }
}
