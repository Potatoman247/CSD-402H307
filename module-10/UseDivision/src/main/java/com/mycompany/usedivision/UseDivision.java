/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usedivision;

/**
 *
 * Aidan Jacoby Module 10 Assignment 9/27/25
 */
public class UseDivision {

    public static void main(String[] args) {
        DomesticDivision Paul = new DomesticDivision("Paul Skenes", 1, "Pennsylvania");
        DomesticDivision Kobe = new DomesticDivision("Kobe Bryant", 2, "California");
        InternationalDivision Luka = new InternationalDivision("Luka Doncic", 3, "Slovenia", "Slovene");
        InternationalDivision Victor = new InternationalDivision("Victor Wembenyama", 4, "France", "Frnech");
        
        Paul.display();
        Kobe.display();
        Luka.display();
        Victor.display();
    }
}
