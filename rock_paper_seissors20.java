/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arjun;

import java.util.*;

/**
 *
 * @author Arjun
 */
public class rock_paper_seissors20 {
    public static void main(String[] args) {
        System.out.println("choose  any one ....... ");
          
          System.out.println("ROCK k liye 1.... ");
          System.out.println("PAPER k liye 2....");
           System.out.println("SEISSORS k liye 3....");
      Scanner in = new Scanner(System.in);
      
      
        System.out.println("enter the number only in (1 , 2, 3) ");
        
        int  playerinput = in.nextInt();
        Random random = new Random();
        int  computermove = random.nextInt(3);
        
        if(playerinput == computermove)
        {
            System.out.println("Game Is Tei!!!!");
        }
        else if(playerinput == 0 && computermove==2|| playerinput == 1 && computermove==0||playerinput == 2 && computermove==1)
        {
            System.out.println("Hurahhhhhhhh...    you win This Game....");
        }
        
        else
        {
            System.out.println("ohh..... You Lose The Game....");
        }
        System.out.println("computer Ne J Chuna Tha..."+computermove);
    }
}
