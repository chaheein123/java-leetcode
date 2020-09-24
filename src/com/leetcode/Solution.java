package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    // #1528
    public String restoreString(String s, int[] indices) {
        char[] dp = new char[s.length()];
        for (int i=0; i<s.length(); i++) {
            dp[indices[i]] = s.charAt(i);
        }
        return new String(dp);
    }

    // #268
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return sum - actualSum;
    }

    // #151
//    public String reverseWords(String s) {
//
//    }

    // #1576
    public String modifyString(String s) {
        String alphabets = "abc";
        char[] charArr = s.toCharArray();
        for (int i=0; i<charArr.length; i++) {
            char letter = charArr[i];
            if (letter == '?') {
                char left = i == 0 ? charArr[i] : charArr[i-1];
                char right = i == charArr.length-1 ? charArr[i] : charArr[i+1];
                for (int j=0; j<alphabets.length(); j++) {
                    char currentAlph = alphabets.charAt(j);
                    if (currentAlph != left && (currentAlph != right || right == '?') ) {
                        charArr[i] = alphabets.charAt(j);
                        break;
                    }
                }
            }
        }
        return new String(charArr);
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
