package com.learn.dp.dp1recursion;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.learn.dp.dp1_recursion.Dp1_Recursion;

public class Dp1Test {
    
    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeEach
    public void before() {
        System.out.println("Before Each");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After Class");
    }

    @DisplayName("Factorial Test")
    @Test
    public void factorial() {
        
        assertEquals(1, Dp1_Recursion.factorial(0));
        assertEquals(1, Dp1_Recursion.factorial(1));
        assertEquals(120, Dp1_Recursion.factorial(5));
    }

    @DisplayName("Fibo Test")
    @Test
    public void fibo() {

        assertDoesNotThrow(() -> assertEquals(0, Dp1_Recursion.fibo(0)));
        assertDoesNotThrow(() -> assertEquals(1, Dp1_Recursion.fibo(1)));
        assertDoesNotThrow(() -> assertEquals(5, Dp1_Recursion.fibo(5)));
        assertDoesNotThrow(() -> assertEquals(8, Dp1_Recursion.fibo(6)));
        assertDoesNotThrow(() -> assertEquals(13, Dp1_Recursion.fibo(7)));
    }

    @DisplayName("Is Array Sorted")
    @Test
    public void isArraySorted() {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 4, 4, 5};
        int arr3[] = {5, 4, 3, 2, 1};
        int arr4[] = {1, 2, 5, 4, 3};
        int arr5[] = {1, 2, 4, 4, 3};

        assertTrue(Dp1_Recursion.isArraySorted(arr1, 0));
        assertTrue(Dp1_Recursion.isArraySorted(arr2, 0));
        assertFalse(Dp1_Recursion.isArraySorted(arr3, 0));
        assertFalse(Dp1_Recursion.isArraySorted(arr4, 0));
        assertFalse(Dp1_Recursion.isArraySorted(arr5, 0));
    }

    @DisplayName("Is Array Partition")
    @Test
    public void isArrayPartition() {

        int arr1[] = {5, 11, 5, 1};
        int arr2[] = {1, 2, 4, 4, 5};
        int arr3[] = {5, 4, 3, 2, 1};
        int arr4[] = {1, 2, 5, 4, 3};
        int arr5[] = {1, 2, 4, 4, 3};

        assertTrue(Dp1_Recursion.isArrayPartition(arr1));
        assertTrue(Dp1_Recursion.isArrayPartition(arr2));
        assertFalse(Dp1_Recursion.isArrayPartition(arr3));
        assertFalse(Dp1_Recursion.isArrayPartition(arr4));
        assertTrue(Dp1_Recursion.isArrayPartition(arr5));
    }

    
}
