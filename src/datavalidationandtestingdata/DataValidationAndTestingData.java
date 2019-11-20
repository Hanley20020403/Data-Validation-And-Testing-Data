/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datavalidationandtestingdata;

import java.util.Scanner;

/**
 *
 * @author Acer User
 */
public class DataValidationAndTestingData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        System.out.println("Please enter data into the program at a number of stages: ");
        String ans;
        int length;
        int number;
        
       
        while (true)
        {
            System.out.println("Step 1: enter a string that is greater than 6 characters long.");
            ans = keyedInput.next();
            length = ans.length();
            
            if(length > 6)
            {
                break;
            }
        }
        
         while (true)
        {
            System.out.println("Step 2: enter a string that contains at least one lowercase a.");
            ans = keyedInput.next();
            
            if(ans.contains("a"))
            {
                break;
            }
        }
        
         while (true)
        {
            System.out.println("Step 3:enter a string that is between 5 and 15 characters long, and does not contain the letter “z”.");
            ans = keyedInput.next();
            length = ans.length();
             
            if(!ans.contains("z") && length>=5 && length<=15)
            {
                break;
            }
        }
        
        
          while (true)
        {
            System.out.println("Step 4: enter an integer between 5 and 500.");
            ans = keyedInput.next();
            number = Integer.parseInt(ans);
                    
            if(number>=5 && number<=500)
            {
                break;
            }
        }
         
         while (true)
        {
            System.out.println("Step 5: enter a negative integer.");
            ans = keyedInput.next();
            number = Integer.parseInt(ans);
                    
            if(number<0)
            {
                break;
            }
        }
         
        
         while (true)
        {
            System.out.println("Step 6: enter a positive, odd integer.");
            ans = keyedInput.next();
            number = Integer.parseInt(ans);
                    
            if(number>0 && (number%2)!=0)
            {
                break;
            }
        }
         
        System.out.println("Congratulations");  
         
        
    }
    
}
