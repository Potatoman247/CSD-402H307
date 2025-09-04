/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module4assignment;
// Aidan Jacoby Module 4 Assignment 8/29/25
/**
 *
 * @author Aidan
 */
public class Module4assignment {

    public static int averageArray(int[]array) {
        int sum = 0;
        for(int i=0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
    public static short averageArray(short[]array) {
        short sum = 0;
        for(int i=0; i < array.length; i++){
            sum += array[i];
        }
        return (short) (sum / array.length);
    }
    public static long averageArray(long[]array) {
        long sum = 0;
        for(int i=0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
    public static double averageArray(double[]array) {
        double sum = 0;
        for(int i=0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
    public static void main(String[] args) {
        int intArray[] = new int [15];
        for(int i=0; i < intArray.length; i++){
            intArray[i] = (int)(Math.random() * 100 + 1);
        }
        short shortArray[] = new short [20];
        for(int i=0; i < shortArray.length; i++){
            shortArray[i] = (short)(Math.random() * 100 + 1);
        }
        long longArray[] = new long [10];
        for(int i=0; i < longArray.length; i++){
            longArray[i] = (long)(Math.random() * 100 + 1);
        }
        double doubleArray[] = new double [5];
        for(int i=0; i < doubleArray.length; i++){
            doubleArray[i] = Math.random() * 100 + 1;
        }
        System.out.println(averageArray(intArray));
        System.out.println(averageArray(shortArray));
        System.out.println(averageArray(longArray));
        System.out.println(averageArray(doubleArray));
    }
}
