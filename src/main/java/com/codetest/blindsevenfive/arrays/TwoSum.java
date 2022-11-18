/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codetest.blindsevenfive.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given an array of integers nums and an integer target, return indices of
 * the<br>
 * two nums such that they add up to target.<br>
 *
 * You may assume that each input would have exactly one solution, and you may
 * not <br>use the same element twice.<br>
 *
 * You can return the answer in any order.<br>
 *
 *
 *
 * Example 1:<br>
 * <br>
 * Input: nums = [2,7,11,15], target = 9<br>
 * Output: [0,1]<br>
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].<br>
 * Example 2:<br>
 * <br>
 * Input: nums = [3,2,4], target = 6<br>
 * Output: [1,2]<br>
 * Example 3:<br>
 * <br>
 * Input: nums = [3,3], target = 6<br>
 * Output: [0,1]<br>
 * <br>
 *
 * Constraints:<br>
 * <br>
 * 2 <code><=</code> nums.length <code><=</code> 104<br>
 * -109 <code><=</code> nums[i] <code><=</code> 109<br>
 * -109 <code><=</code> target <code><=</code> 109<br>
 * Only one valid answer exists.<br>
 * <br>
 *
 * @author Uche Powers
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] result = twoSumT(new int[]{3, 2, 4}, 6);
        printL(result);
        System.out.println("");
        result = twoSum(new int[]{3, 2, 4}, 6);
        printL(result);

    }
    
    

    public static void printL(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int arg = nums[i];
            System.out.println("Indx = " + i + ", Value = " + arg);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static int[] twoSumT(int[] nums, int target) {
        int[] result = new int[2];
        var map = new HashMap<Integer, Integer>();

        for (int n = 0; n < nums.length; n++) {
            var difference = target - nums[n];

            if (map.containsKey(difference)) {
                result[1] = n;
                result[0] = map.get(difference);
                return result;
            }
            map.put(nums[n], n);
        }

        return result;
    }

}
