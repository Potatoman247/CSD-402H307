/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module8assignment;
import java.util.Scanner;
/**
 *
 * Aidan Jacoby Module 8 Assignment 9/20/25
 */
public class Module8assignment {

    public static void main(String[] args) {
        AidanArrayListTest test = new AidanArrayListTest();
        Scanner getInfo = new Scanner(System.in);
        int cont = 1;
        
        while (cont != 0) {
            System.out.println("Please Input a Number: ");
            int nextInt = getInfo.nextInt();
            test.addNum(nextInt);
            cont = nextInt;
        }
        
        System.out.println("Largest Number: "+test.max(test.getArrayList()));
    }
}
