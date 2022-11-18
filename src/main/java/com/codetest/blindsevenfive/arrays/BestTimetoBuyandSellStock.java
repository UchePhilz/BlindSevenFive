/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codetest.blindsevenfive.arrays;

/**
 *
 * @author Uche Powers
 */
public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        testCode(new int[]{1, 4, 2});
        testCode(new int[]{7, 1, 5, 3, 6, 4});
        testCode(new int[]{7, 6, 4, 3, 1});
    }

    private static void testCode(int[] prices) {
        int maxProfit = maxProfit2(prices);
        System.out.println("Max Profit: " + maxProfit);
    }

    public static int maxProfit2(int[] prices) {
        int lowPrice = prices[0];
        int lowPriceIndex = 0;
        
        int highestPrice = 0;
        int highestPriceIndex = 0;
        
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < lowPrice) {
                lowPriceIndex = i;
                lowPrice = prices[i];
                if (lowPriceIndex < highestPriceIndex) {
                    maxProfit = Math.max(highestPrice - lowPrice, maxProfit);
                }
                continue;
            }
            if (prices[i] > lowPrice) {
                highestPrice = prices[i];
                highestPriceIndex = i;
                if (lowPriceIndex < highestPriceIndex) {
                    maxProfit = Math.max(highestPrice - lowPrice, maxProfit);
                }
            }

        }

        return maxProfit;
    }

    public static int maxProfit1(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max = 0;
        int sofarMin = prices[0];
        for (int i = 0; i < prices.length; ++i) {
            if (prices[i] > sofarMin) {
                max = Math.max(max, prices[i] - sofarMin);
            } else {
                sofarMin = prices[i];
            }
        }
        return max;
    }

    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        return op;
    }

}
