package com.learn.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.learn.dsa.dsa1_arrays.A1_BinarySearch;
import com.learn.dsa.dsa1_arrays.A2_MaxSubarray;
import com.learn.dsa.dsa1_arrays.A3_KRotate;

public class Dsa1Test {
    
    @DisplayName("Binary Search")
    @Test
    public void binarySearch() {

        int arr[] = {-1,0,3,5,9,12};

        int val = A1_BinarySearch.binarySearch(arr, 9);
        assertEquals(4, val);
    }

    @DisplayName("Max Sub Array - Kadane Algo")
    @Test
    public void kadaneAlgo() {

        int arr[] = {-2, 3, 4, -1, 5, -12, 6, 1, 3};

        int val = A2_MaxSubarray.kadaneAlgo(arr);
        assertEquals(val, 11);

        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        val = A2_MaxSubarray.kadaneAlgo(arr1);
        assertEquals(val, 6);

        int[] arr2 = {5, 4, -1, 7, 8};
        val = A2_MaxSubarray.kadaneAlgo(arr2);
        assertEquals(val, 23);

        int[] arr3 = {1};
        val = A2_MaxSubarray.kadaneAlgo(arr3);
        assertEquals(val, 1);

        int[] arr4 = {-1};
        val = A2_MaxSubarray.kadaneAlgo(arr4);
        assertEquals(val, -1);

        int[] arr5 = {-2, -1};
        val = A2_MaxSubarray.kadaneAlgo(arr5);
        assertEquals(val, -1);
    }

    @DisplayName("Max Sub Array")
    @Test
    public void maxSubArray() {

        int arr[] = {-2, 3, 4, -1, 5, -12, 6, 1, 3};

        int val = A2_MaxSubarray.maxSubArray(arr);
        assertEquals(val, 11);

        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        val = A2_MaxSubarray.maxSubArray(arr1);
        assertEquals(val, 6);

        int[] arr2 = {5, 4, -1, 7, 8};
        val = A2_MaxSubarray.maxSubArray(arr2);
        assertEquals(val, 23);

        int[] arr3 = {1};
        val = A2_MaxSubarray.maxSubArray(arr3);
        assertEquals(val, 1);

        int[] arr4 = {-1};
        val = A2_MaxSubarray.maxSubArray(arr4);
        assertEquals(val, -1);

        int[] arr5 = {-2, -1};
        val = A2_MaxSubarray.maxSubArray(arr5);
        assertEquals(val, -1);
    }

    @DisplayName("Max Sub Array")
    @Test
    public void kRotate() {

        int[] arr = {1,2,3,4,5,6,7};

        A3_KRotate.kRotate(arr, 3);
        for(int i: arr)
            System.out.print(i+" ");
    }
}
