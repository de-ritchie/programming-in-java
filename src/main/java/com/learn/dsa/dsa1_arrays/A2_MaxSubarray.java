package com.learn.dsa.dsa1_arrays;

public class A2_MaxSubarray {
    
    public static int kadaneAlgo(int arr[]) {

        int currSum = 0;
        int maxVal = arr[0];

        for(int i = 0; i < arr.length; i++) {

            int curr = arr[i];
            if(i == 0) {
                currSum = curr;
            } else {

                currSum += curr;
            }
            if(currSum > maxVal) {
                maxVal = currSum;
            }
            currSum = currSum < 0 ? 0 : currSum;
        }

        return maxVal;
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int maxSumEndingHere = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            maxSumEndingHere = Math.max(nums[i], maxSumEndingHere + nums[i]);
            maxSum = Math.max(maxSum, maxSumEndingHere);
        }
        
        return maxSum;
    }
}
