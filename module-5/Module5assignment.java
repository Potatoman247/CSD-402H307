/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module5assignment;

/**
 *
 * Aidan Jacoby Module 5 Assignment: 9/6/25
 */
public class Module5assignment {
    
    public static int locateLargest(int[]array) {
        int maxArray = 0;
        for(int i=0; i < array.length; i++){
            if (array[i] > maxArray) {
                maxArray = array[i];
            }
        }
        return maxArray;
    }
    public static double locateLargest(double[]array) {
        double maxArray = 0;
        for(int i=0; i < array.length; i++){
            if (array[i] > maxArray) {
                maxArray = array[i];
            }
        }
        return maxArray;
    }
    
    public static int locateSmallest(int[]array) {
        int minArray = 0;
        for(int i=0; i < array.length; i++){
            if (i == 0) {
                minArray = array[i];
            }
            if (array[i] < minArray) {
                minArray = array[i];
            }
        }
        return minArray;
    }
    public static double locateSmallest(double[]array) {
        double minArray = 0;
        for(int i=0; i < array.length; i++){
            if (i == 0) {
                minArray = array[i];
            }
            if (array[i] < minArray) {
                minArray = array[i];
            }
        }
        return minArray;
    }
    public static void main(String[] args) {
        int intArray[] = new int [15];
        for(int i=0; i < intArray.length; i++){
            intArray[i] = (int)(Math.random() * 100 + 1);
        }
        double doubleArray[] = new double [5];
        for(int i=0; i < doubleArray.length; i++){
            doubleArray[i] = Math.random() * 100 + 1;
        }
        
        System.out.println(locateLargest(intArray));
        System.out.println(locateLargest(doubleArray));
        System.out.println(locateSmallest(intArray));
        System.out.println(locateSmallest(doubleArray));
    }
}
