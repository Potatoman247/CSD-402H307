/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module7assignment;
import java.util.ArrayList;

/**
 *
 * @author Aidan
 */
public class UseFans {
    public ArrayList<Fan> Fans = new ArrayList<>();
    
    public void addFan(Fan Fan) {
        Fans.add(Fan);
    }
    
    public void deleteFan(Fan Fan) {
        for (int i = 0; i < Fans.size(); i++) {
            if (Fan == Fans.get(i)){
                Fans.remove(i);
            }
        }
    }
        public void displayFans() {
        for (int i = 0; i < Fans.size(); i++) {
                System.out.println(Fans.get(i));
        }
    }
    
    public Fan displayFan(Fan Fan) {
        for (int i = 0; i < Fans.size(); i++) {
            if (Fan == Fans.get(i)){
                return Fans.get(i);
            }
        }
        return Fans.get(0);
    }
    

}
