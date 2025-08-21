/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module3assignment;
import java.lang.Math;
/** Aidan Jacoby 8/21/25 Module 3 Assignment
 *
 * @author Aidan
 */
public class Module3assignment {

    public static void main(String[] args) {
        int minNum = 1;
        int currentNum = 0;        
        int rowCount = 7;
        int step = 0;
        // Row Building 
        for(int i = 0; i < rowCount; ++i){
            if (i <= 4 ) {
                for( int j = rowCount*2-i*2; j>0; j--){
                System.out.print(" ");
                }
            }
            else if (i < 6) {
                for( int j = rowCount*2-((i*2)+1); j>0; j--){
                System.out.print(" ");
                }
            }
            else {
                for( int j = rowCount*2-((i*2)+2); j>0; j--){
                System.out.print(" ");
                }
            }
            while(step < i){
                for(step =0; step < i; ++step){
                    currentNum = 1*(int)Math.pow(2, step);
                    System.out.print(currentNum+" ");
                }  
            }
            for(step = i;step >= 0; --step) {                
                currentNum = 1*(int)Math.pow(2, step);
                if (step > 0) {
                        System.out.print(currentNum+" ");
                    }
                    else{
                        System.out.print(currentNum);
                    }
            }
            if (i < 3) {
                for( int j = rowCount*2-((i*2)-4); j>0; j--){
                System.out.print(" ");
                }
            }

            if (i >= 3) {
                for( int j = rowCount*3-i*3; j>0; j--){
                System.out.print(" ");
                }
            }
           
            
            System.out.print("@");
            System.out.println();
        }
    }
}
