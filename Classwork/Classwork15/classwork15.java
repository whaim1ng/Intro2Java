//********************************************************************
//  classwork15.java       Author: Max Wang
//
//  java is so fun!!!!
//********************************************************************
import java.util.*;

public class classwork15 {
   public static void main(String[] args) {
      // first task
      // print 45, 36, 27, 18, 9 , 0, -9, -18, -27, -36, -45
      int count = 45;
      
      // for loop
      for(int i = 1; i <= 11; i++) {
         if (count == -45) {
           System.out.println(count+ ".");
         } else {
            System.out.print(count + ", ");
         }
         count -= 9;
      }
      
      // while loop
      count = 45;
      
      while (count >= -45) {
         if (count == -45) {
           System.out.println(count+ ".");
         } else {
            System.out.print(count + ", ");
         }
         count -= 9;
      }
      
      // do while loop
      count = 45;
      
      do {
         if (count == -45) {
           System.out.println(count+ ".");
         } else {
            System.out.print(count + ", ");
         }
         count -= 9;
      } while (count >= -45);
       
      System.out.println("\n");  
        
      // second task 
      int maxRows = 9;
      
      for (int i = 1; i <= maxRows; i++) {
         if (i == 5) {
            // horizontal line
            for (int j = 1; j< 9; j++) {
               System.out.print("* ");
            }
            System.out.println("*");
         } else if (i < 5) {
            // first diag
            for (int j = 0; j <= i; j++) {
               System.out.print(" ");
            }
            System.out.print("* ");
            
            // middle line
            for (int j = 3; j >= i; j--) {
               System.out.print(" ");
            }
            System.out.print("*");
            
            // last diag
            for (int j = 3; j >= i; j--) {
               System.out.print(" ");
            }
            System.out.println(" *");
            
         } else {
               // first diag 
               for (int j = 3; j >= i; j--) {
                  System.out.print(" ");
               }
               System.out.print("*");
               
               // middle line
               for (int j = 0; j <=i; j++) {
                  System.out.print(" ");
               }
               System.out.print("* ");
                          
               // last diag
              for (int j = 0; j <=i; j++) {
                 System.out.print(" ");
              }
              System.out.println("* ");         
            
         }
         
      }
      
   }
}