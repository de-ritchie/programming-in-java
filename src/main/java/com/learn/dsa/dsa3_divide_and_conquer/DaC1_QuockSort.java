package com.learn.dsa.dsa3_divide_and_conquer;

public class DaC1_QuockSort {
    
    private static int parition(int arr[], int start, int end) {

        int p = start;
        int i = start + 1, j = end;
        
        while(i<=j) {

            if(arr[i] > arr[p]) {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                j --;
            } else {
                i ++;
            }
        }

        int tmp = arr[i-1];
        arr[i-1] = arr[p];
        arr[p] = tmp;

        p = i - 1;

        return p;
    }

    private static void quickSort(int arr[], int start, int end) {

        if(start >= end) {
            return;
        }

        int pivot = parition(arr, start, end);

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);

    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
}
