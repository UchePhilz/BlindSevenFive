/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codetest.blindsevenfive.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Uche Powers
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> intList = new ArrayList<Integer>();

        for (int n : nums) {
            if (intList.contains(n)) {
                return true;
            } else {
                intList.add(n);
            }
        }
        System.out.println(intList);
        return false;
//return Set.of(nums).size() != nums.length;
    }

}
