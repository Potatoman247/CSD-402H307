/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module12assignment;

/**
 *
 * Aidan Jacoby 10/11/25 Module 12
 */
public class Module12assignment {
    
    public static double yearlyService() {
        System.out.println("No Parameters Found");
        double  cost = 80;
        return cost;
    }
    
    public static double yearlyService(boolean oilChange) {
        System.out.println("One Parameter Found");
        
        double cost = 80.00;

        if (oilChange == true){
            cost += 45.00;
        }
        
        return cost;
    }
    
    public static double yearlyService(boolean oilChange, double tireRotation) {
        System.out.println("Two Parameters Found");
        double cost = 80.00;

        if (oilChange == true){
            cost += 45.00;
        }
        
        cost += tireRotation;
        
        return cost;
    }
    
    public static double yearlyService(boolean oilChange, double tireRotation, double coupon) {
        System.out.println("Three Parameters Found");
        double cost = 80.00;

        if (oilChange == true){
            cost += 45.00;
        }
        cost += tireRotation;
        cost -= coupon;
        
        return cost;
    }
    public static void main(String[] args) {
        System.out.println(yearlyService());
        System.out.println(yearlyService());
        
        System.out.println(yearlyService(true));
        System.out.println(yearlyService(false));
        
        System.out.println(yearlyService(true, 75.00));
        System.out.println(yearlyService(false, 35.00));
        
        System.out.println(yearlyService(true, 80.00, 15.00));
        System.out.println(yearlyService(false, 100.00, 80.00));
    }
}
