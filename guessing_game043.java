/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arjun;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arjun
 */
public class guessing_game043 {
    public static void main(String[] args) {
        
        System.out.println("<<<<<WELCOME TO THE GUESSING GAME >>>>>");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("You should complete within 5 trails ");
        
      

        Random random = new  Random();
        int rand = random.nextInt(5);
                              
        
        for(int i =0 ; i < 5 ; i++ )
        {
            System.out.println("Enter the gussing no.");
            
         int    guessing = sc.nextInt();
            
            if(guessing == rand )
                
            {
                System.out.println("Hurhhh you are find the no.");
                
                break;
            }
            
           
//            {
//                if (guessing > rand )
//            {
//                System.out.println("your gusseing number is greater than random number :");
//            }
//            
//            else 
//            {
//                System.out.println("your  gusseing  number is less than random number :");
//            }
//        } 
            
            else if (guessing > rand )
            {
                  System.out.println("Your gusseing number is greater than random number :");
            }
            
            else if ( guessing < rand )
            {
                 System.out.println("Your  gusseing  number is less than random number :");
            }
            
            else 
            {
                System.out.println("Your number  is out of range :");
                        
            }
    }
    
    }
}
