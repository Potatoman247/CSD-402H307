/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usedivision;

/**
 *
 * @author Aidan
 */
abstract class Division{
    String name;
    int accNum;
    public Division(String name, int accNum){
        this.name = name;
        this.accNum = accNum;
    }
    public abstract void display();
}
