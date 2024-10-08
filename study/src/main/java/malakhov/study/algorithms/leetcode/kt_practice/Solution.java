package malakhov.study.algorithms.leetcode.kt_practice;

import java.util.Arrays;

public class Solution {
    //Task:
    //Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    //Note that you must do this in-place without making a copy of the array.
    //
    //Example 1:
    //Input: nums = [0,1,0,3,12]
    //Output: [1,3,12,0,0]
    //Example 2:
    //Input: nums = [0]
    //Output: [0]
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        move(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void move(int[] nums) {
        int i = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
