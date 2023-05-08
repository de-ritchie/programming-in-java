package com.learn.dp.dp1_recursion;

/*
 *  Recursion
 *  Recursion is a technique where the soltion to a problem depends on solutions to smaller instances of the same problem
 * 
 *  Idea of recursion
 *  - Recursive call
 *  - Base case
 * 
 *  Things to be noted
 *  - Figure of the Smallest case (Base case)
 *  - Always Assume the Subproblem can be solved
 *  - Solve the current problem assuming subproblem solution exists
 */

public class Dp1_Recursion {

    public static int factorial(int n) {

        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static int fibo(int n) throws Exception {

        if (n < 0)
            throw new Exception("n less than 0");
        if (n == 0 || n == 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static boolean isArraySorted(int[] arr, int index) {

        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] <= arr[index + 1] && isArraySorted(arr, index + 1);
    }

    public static boolean isArrayPartition(int[] arr, int index, int sum, int currSum) {

        if (sum == currSum) {
            return true;
        }

        if (index == arr.length || currSum > sum) {
            return false;
        }

        return isArrayPartition(arr, index + 1, sum, arr[index] + currSum) ||
                isArrayPartition(arr, index + 1, sum, currSum);
    }

    public static boolean isArrayPartition(int[] arr) {

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        if (sum % 2 == 0) {
            return isArrayPartition(arr, 0, sum / 2, 0);
        }
        return false;
    }
}
