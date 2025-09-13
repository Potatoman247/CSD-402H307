/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module6assignment;

/**
 *
 * Aidan Jacoby Module 6 Assignment 9/6/25
 */
public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed = STOPPED;
    private boolean fanState;
    private int radius = 6;
    private String color = "White";
    
    Fan(int speed, boolean fanState, int radius, String color){
        this.speed = speed;
        this.fanState = fanState;
        this.radius = radius;
        this.color = color;
    }
    Fan(){
        super();
    }
    
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    public boolean getFanState(){
        return fanState;
    }
    public void setFanState(boolean newFanState){
        fanState = newFanState;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int newRadius){
        radius = newRadius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    @Override
    public String toString(){
        return "Fan Speed: "+speed+", Is Fan On: "+fanState+", Fan Radius: "+radius+", Fan Color: "+color;
    }
}