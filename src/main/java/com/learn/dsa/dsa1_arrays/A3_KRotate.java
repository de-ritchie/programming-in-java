package com.learn.dsa.dsa1_arrays;

public class A3_KRotate {
    
    public static void kRotate(int[] arr, int k) {

        int n = arr.length;
        int j = k % n;

        if(j == 0) {
            return;
        }

        int[] arrDup = new int[n];

        for(int i = 0; i < n; i ++) {
            arrDup[i] = arr[i];
        }

        for(int i = 0; i < n; i ++) {
            arr[j] = arrDup[i];
            j ++;
            j %= n;
        }
    }
}
