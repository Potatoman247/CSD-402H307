/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module6assignment;

/**
 *
 * Aidan Jacoby Module 6 Assignment 9/6/25
 */

public class Module6assignment {

    public static void main(String[] args) {
        Fan defaultFan  = new Fan();
        System.out.println(defaultFan.toString());
        Fan customFan = new Fan(2,true,7,"Blue");
        System.out.println(customFan.toString());
    }
}
