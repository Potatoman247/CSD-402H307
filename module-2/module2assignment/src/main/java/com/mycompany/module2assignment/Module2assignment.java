/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// Aidan Jacoby Programming Assignment Module 2 8/21/25
// The Purpose of this code is to play a simple game of rock paper scissors
package com.mycompany.module2assignment;
import java.util.Scanner;
/**
 *
 * @author Aidan
 */
public class Module2assignment {

    public static void main(String[] args) {
        int again = 1;
        while (again == 1) {
            // Generate Random Number
            int randomNum = (int)(Math.random() * 4 + 1);
            // Fix For Rounding Error Where 2.5 Became 3 + 1 And Skipped Round
            if (randomNum > 3) {
                randomNum = randomNum - 1;
            }
            
            // Get User Input
            System.out.print("Please Select 1 For Rock, 2 For Paper, Or 3 For Scissors: ");
            Scanner getInfo = new Scanner(System.in);
            int rpc = getInfo.nextInt();
            
            // Game Winner Logic            
            if(rpc > 0) {
                if (rpc < 4) {
                    if (rpc == 1) {
                        if (randomNum == 1) {
                            System.out.print("User Chose Rock, System Chose Rock. It is a Draw! Press 1 To Continue Or 0 To Stop: ");
                            again = getInfo.nextInt();
                        }
                        if (randomNum == 2) {
                            System.out.print("User Chose Rock, System Chose Paper. System Wins! Press 1 To Continue Or 0 To Stop: ");
                            again = getInfo.nextInt();
                        }
                        if (randomNum == 3) {
                            System.out.print("User Chose Rock, System Chose Scissors. User Wins! Press 1 To Continue Or 0 To Stop: ");
                            again = getInfo.nextInt();
                        }
                    }
                    if (rpc == 2) {
                        if (randomNum == 1) {
                            System.out.print("User Chose Paper, System Chose Rock. User Wins! Press 1 To Continue Or 0 To Stop: ");
                            again = getInfo.nextInt();
                        }
                        if (randomNum == 2) {
                            System.out.print("User Chose Paper, System Chose Paper. It is a Draw! Press 1 To Continue Or 0 To Stop: ");
                            again = getInfo.nextInt();
                        }
                        if (randomNum == 3) {
                            System.out.print("User Chose Paper, System Chose Scissors. System Wins! Press 1 To Continue Or 0 To Stop: ");
                            again = getInfo.nextInt();
                        }
                    }
                    if (rpc == 3) {
                        if (randomNum == 1) {
                            System.out.print("User Chose Scissors, System Chose Rock. System Wins! Press 1 To Continue Or 0 To Stop: ");
                            again = getInfo.nextInt();
                        }
                        if (randomNum == 2) {
                            System.out.print("User Chose Scissors, System Chose Paper. User Wins! Press 1 To Continue Or 0 To Stop: ");
                            again = getInfo.nextInt();
                        }
                        if (randomNum == 3) {
                            System.out.print("User Chose Scissors, System Chose Scissors. It is a Draw! Press 1 To Continue Or 0 To Stop:  ");
                            again = getInfo.nextInt();
                        }
                    }
                }
                else {
                System.out.println("Invalid Input, Please Try Again");
                }
            }
            else {
                System.out.println("Invalid Input, Please Try Again");
            }
        }
    }
}
