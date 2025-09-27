/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usedivision;

/**
 *
 * @author Aidan
 */
class DomesticDivision extends Division{
    String state;
    public DomesticDivision(String name, int accNum, String state){
        super(name, accNum);
        this.state = state;
    }
    @Override
    public void display(){
                System.out.println("Name: "+name+"\nAccount Number: "+accNum+"\nState: "+state+"\n");

    }
}
