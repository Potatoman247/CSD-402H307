/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module7assignment;

/**
 *
 * Aidan Jacoby 9/13/25 Module 7 Assignment
 */
public class Module7assignment {

    public static void main(String[] args) {
        UseFans Use = new UseFans();
        
        Fan defaultFan  = new Fan();
        Fan customFan = new Fan(2,true,7,"Blue");
        Fan redFan = new Fan(0,false,9,"Red");
        Fan fastFan = new Fan(3,true,4,"Orange");
        
        Use.addFan(defaultFan);
        Use.addFan(customFan);
        Use.addFan(redFan);
        Use.addFan(fastFan);
        
        System.out.println(Use.displayFan(defaultFan));
        System.out.println();
        Use.displayFans(); 
    }
}
