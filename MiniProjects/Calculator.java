//********************************************************************
//  Calculator.java       Author: Max Wang
//
//  java is so fun!!!!
//********************************************************************

import java.util.*;

public class Calculator {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      
      // creates all variables needed
      int choice = 2182848;
      double in1 = 0, in2 = 0, ans = 0;
      
      // prints menu
      while (11 < choice) {
         System.out.println("1. Addition(x+y)\n2. Subtraction(x-y)\n3. Multiplication(x*y)\n4. Division(x/y)\n5. Power(x^y)\n6. Highest Value\n7. Lowest Value\n8. Absolute Value\n9. Random(from 0 to x)\n10. Square Root\n11. Log(base 10)");
         System.out.print("Enter your choice(1-11): ");
         // catches if the user enters something other than an integer
         try {
            choice = Integer.parseInt(sc.nextLine());
         }
         catch (Exception e) {
            System.out.println("Enter an Integer Please!");
         }
         // catches if the user enters a choice greater than the number of choices provided
         if (choice > 11) {
            System.out.println("Choose a number between 1 and 11 stupid!!");
         }
      }
      // for specific equations, only one input is needed
      if (choice == 8 || choice == 9 || choice == 10 || choice == 11) {
         System.out.print("Enter your input: ");
         in1 = sc.nextDouble();
         in2 = 0;
      } else if (choice == 4) {
         System.out.print("Enter your first input: ");
         in1 = sc.nextDouble();
         // if the user enters 0, division will not be possible
         while (in2 == 0) {
            System.out.print("Enter a non-zero second input: ");
            in2 = sc.nextDouble();
         }
      } else {
         System.out.print("Enter your first input: ");
         in1 = sc.nextDouble();
         System.out.print("Enter your second input: ");
         in2 = sc.nextDouble();
      }
      
      // does calculations
      switch (choice) {
         case 1:
            // addition
            ans = in1 + in2;
         break;
         
         case 2:
            // subtraction
            ans = in1 - in2;
         break;
         
         case 3:
            // multiplication
            ans = in1 * in2;
         break;
            
         case 4:
            // division
            ans = in1 / in2;
         break;
         
         case 5:
            // exponentiation
            ans = Math.pow(in1, in2);
         break;
         
         case 6:
            // maximum
            ans = Math.max(in1, in2);
         break;
         
         case 7:
            // minimum
            ans = Math.min(in1, in2);
         break;
         
         case 8:
            // absolute value
            ans = Math.abs(in1);
         break;
         
         case 9: 
            // random value
            ans = rand.nextDouble(in1);
         break;
         
         case 10:
            // square root
            ans = Math.sqrt(in1);
         break;
         
         case 11:
            // logarithm
            ans = Math.log10(in1);
         break;
      }
      
      // prints answer
      if (choice == 4) {
         System.out.println("Your answer is " + ans + "!!!");
      } else {
      System.out.printf("Your answer is %.0f!!!", ans);
      }      
   }
}