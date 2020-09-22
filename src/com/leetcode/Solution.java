package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    // #1576
    public String modifyString(String s) {
        int halfLength = (int) ((s.length() % 2 == 0) ? s.length()/2 : Math.ceil(s.length()/2));
        char[] chars = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i=0; i < halfLength; i++) {

            int rightIndex = s.length() - 1 - i;
            if (chars[i] == '?') {

                if (i > 0) {

                }
            }

            if (chars[rightIndex] == '?') {

            }


        }





        for (char i='a'; i<='z'; i++) {
            System.out.println(i);
        }

        return s;
    }



    // #905
    public int[] sortArrayByParity(int[] A) {
        int right = 0;
        int left = 0;
        while (right < A.length) {
            if (A[right] % 2 == 0) {
                int temp = A[right];
                A[right] = A[left];
                A[left++] = temp;
            }
            right++;
        }
        return A;
    }

    // #1470
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];
        for (int i=0, j=0; i<n; i++, j+=2){
            result[j] = nums[i];
            result[j+1] = nums[n+i];
        }
        return result;
    }

    // #480
    public int[] runningSum(int[] nums) {
        for (int i=1; i<nums.length; i++){
            int prevIndex = i-1;
            nums[i] += nums[prevIndex];
        }
        return nums;
    }
}
