/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usedivision;

/**
 *
 * @author Aidan
 */
class InternationalDivision extends Division{
    String country;
    String language;
    public InternationalDivision(String name, int accNum, String country, String language){
        super(name, accNum);
        this.country = country;
        this.language = language;
    }
    @Override
    public void display(){
        System.out.println("Name: "+name+"\nAccount Number: "+accNum+"\nCountry: "+country+"\nSpoken Language: "+language+"\n");
    }
}
