/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module8assignment;
import java.util.ArrayList;
/**
 *
 * Aidan Jacoby Module 8 Assignment 9/20/25
 */
public class AidanArrayListTest {
    
    public ArrayList<Integer> newList = new ArrayList<>();
    
    public ArrayList<Integer> getArrayList() {
        return newList;
    }
    public static int max(ArrayList<Integer> array) {
        int maxArray = 0;
        if(array != null) {
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) > maxArray) {
                    maxArray = array.get(i);
                }
            }
        }

        return maxArray;
    }
    
    public void addNum(int Num) {
        newList.add(Num);
    }
}
