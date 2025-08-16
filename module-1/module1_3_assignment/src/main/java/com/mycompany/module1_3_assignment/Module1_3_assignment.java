/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module1_3_assignment;

import java.util.Scanner;
/**
 *
 * @author Aidan
 */
public class Module1_3_assignment {

    public static void main(String[] args) {        
        Scanner getInfo = new Scanner(System.in);
        
        System.out.println("Please Input Starting Temperature: ");
        int initialTemperature = getInfo.nextInt(); 
        System.out.println("Please Input Final Temperature: ");
        int finalTemperature = getInfo.nextInt(); 
        System.out.println("Please Input Water Mass (Kilograms): ");
        int waterMass = getInfo.nextInt(); 
        
        int Q = waterMass * (finalTemperature-initialTemperature) * 4184;
        
        System.out.print("This action would require ");
        System.out.print(Q);
        System.out.print(" Joulles.");
    }
}
