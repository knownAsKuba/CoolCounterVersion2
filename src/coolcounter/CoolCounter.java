/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coolcounter;

import java.util.Scanner;

/**
 *
 * @author ba248309
 * Name: Jakub Bartlewski
 * Teachers Name: Mr. Yeung
 * Course Code: ICS\
 * Date Started:
 * Date Completed:
 * Description:
 */
public class CoolCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);
        // TODO code application logic here
        
             int choice = 0;
             
             
        
        System.out.println(" Welcome to Cool Counter");
        
        System.out.println("Please Enter your prephered count method");
        System.out.println("choice 1... Count from 0 to 10 by 1");
        System.out.println("choice 2... Count from 100 to 0 by 10");
        System.out.println("choice3...Count from 50 to 500 by 500");
        System.out.println("choice 4... Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your option:");
        
        choice = keyedInput.nextInt();
        
        System.out.println("");
        System.out.println("--------------");
        
        if (choice == 1 )
        { System.out.println("You have chosen choice 1");
        for (int i = 0; i <=10; i = i + 1)
        {
            System.out.println(i);
        }
        
        // if (choice == 2)
        {System.out.println("You have picked choice 2");
          for (int i = 100; i>=0; i = i -10);
        {
              System.out.println(i);
        }
        }
         if (choice == 3)
         {System.out.println("You have picked choice 3");
         for (int i = 50; i ==500; i = i + 50);
         {
             System.out.println(i);
             
         }
         }
         if (choice == 4)
         {System.out.println(" You have chosen choice 4");
         for (int i = 6000; i ,=1000; i = i -1000);
          {
             System.out.println(i);
          }
         }
         
                                                                                
        
    


}
