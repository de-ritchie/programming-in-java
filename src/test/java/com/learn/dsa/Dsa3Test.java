package com.learn.dsa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.learn.dsa.dsa3_divide_and_conquer.DaC1_MegeSort;
import com.learn.dsa.dsa3_divide_and_conquer.DaC1_QuockSort;

public class Dsa3Test {
    
    @DisplayName("Merge Sort")
    @Test
    public void mergeSort() {

        int arr[] = {9, 8, 4, 3, 6, 1};
        int[] result = DaC1_MegeSort.mergeSort(arr);
        for(int i : result) {
            System.out.print(i+" ");
        }
        Arrays.sort(arr);
        assertArrayEquals(result, arr);

        System.out.println();

        int[] arr1 = {5,2,3,1};
        int[] result1 = DaC1_MegeSort.mergeSort(arr1);
        Arrays.sort(arr1);
        assertArrayEquals(result1, arr1);
    }

    @DisplayName("Quick Sort")
    @Test
    public void quickSort() {

        int arr[] = {9, 8, 4, 3, 6, 1};
        DaC1_QuockSort.quickSort(arr);
        for(int i: arr)
            System.out.print(i+" ");
        
        System.out.println();

        int arr1[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        DaC1_QuockSort.quickSort(arr1);
        for(int i: arr1)
            System.out.print(i+" ");
    }
}
