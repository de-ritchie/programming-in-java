package com.learn.dsa.dsa1_arrays;

public class A1_BinarySearch {
    
    public static int binarySearch(int[] nums, int target, int s, int e) {

        if(s > e || s <0 || e > nums.length - 1) {
            return -1;
        }
        if(s == e) {
            return nums[s] == target ? s : -1 ;
        }

        int m = (s+e)/2;

        if(nums[m] == target) {
            return m;
        }
        else if(nums[m] > target) {
            return binarySearch(nums, target, s, m - 1);
        } else {
            return binarySearch(nums, target, m + 1, e);
        }

    }

    public static int binarySearchLoop(int[] nums, int target) {

        int s = 0;
        int e = nums.length - 1;

        while(s <= e) {

            int m = (s + e)/2;
            if(nums[m] == target) {
                return m;
            } else if(nums[m] > target) {
                e = m-1;
            } else {
                s = m + 1;
            }
            System.gc();
        }

        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        // return binarySearch(nums, target, 0, nums.length - 1);
        return binarySearchLoop(nums, target);
    }
}
