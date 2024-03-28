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
      String space = "\t";
      String star = "*";
   }
}