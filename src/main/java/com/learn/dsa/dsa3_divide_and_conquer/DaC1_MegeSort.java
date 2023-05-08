package com.learn.dsa.dsa3_divide_and_conquer;

public class DaC1_MegeSort {
    
    private static int[] merge(int[] p1, int[] p2) {

        int i = 0, j = 0, k = 0;
        int[] result = new int[p1.length + p2.length];

        while(i < p1.length && j < p2.length) {

            if(p1[i] <= p2[j]) {
                result[k] = p1[i];
                i ++;
            } else {
                result[k] = p2[j];
                j ++;
            }
            k ++;
        }

        for(; i < p1.length; i ++) {
            result[k] = p1[i];
            k ++;
        }

        for(; j < p2.length; j ++) {
            result[k] = p2[j];
            k ++;
        }

        return result;
    }

    private static int[] mergeSort(int arr[], int start, int end) {

        if(start == end) {
            int[] result = {arr[start]};
            return result;
        }

        int mid = (start + end)/2;

        int[] p1 = mergeSort(arr, start, mid);
        int[] p2 = mergeSort(arr, mid + 1, end);

        return merge(p1, p2);
    }

    public static int[] mergeSort(int[] arr) {

        return mergeSort(arr, 0, arr.length - 1);
    }
}
