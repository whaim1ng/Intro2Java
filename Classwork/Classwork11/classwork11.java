//********************************************************************
//  classwork10.java       Author: Max Wang
//
//  java is so fun!!!!
//********************************************************************
import java.util.*;

public class classwork11 {
   public static void main (String[] args) {  
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      
      // for integer
      int int1 = sc.nextInt();

      double sqrt1 = Math.sqrt(int1);
      double abs1 = Math.abs(int1);
      int rand1 = rand.nextInt(10);
      
      // for string
      String str1 = sc.nextLine();str1 = sc.nextLine();
      
      int length1 = str1.length();
      int j = length1 - 1;           
      
      // prints the results for the integer
      System.out.println("integer results :   " + "square root: " + sqrt1 + " absolute value: " + abs1 + " random value: " +  rand1);
      
      // prints results from string
      System.out.print("string results :   " + "length: " + length1 + " last 6 letters : ");
      for(int i = 0; i < 6; i++) {
         System.out.print(str1.charAt(j));
         j = j - 1;
      }
   }
}