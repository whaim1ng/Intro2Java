//********************************************************************
//  ArrayMethods.java       Author: Max Wang
//
//  
//********************************************************************import java.util.*;
import java.util.*;

public class ArrayMethods {
   // This method takes an integer array as a parameter and returns the array as a string
   public static String arrayToString(int[] arr) {
      String array = "";
      // prints the array as a string
      for (int i = 0; i < arr.length; i++) {
         array = array + arr[i] + " ";
      }
      return array;
   }

   //This method takes an integer array as a parameter and returns a new array in reverse order.
   public static int[] reverseArray(int[] arr) {
      int[] array = new int[arr.length];
      // starts forming the array from right to left in a new array
      for (int i = 0; i < arr.length; i++) {
         array[i] = arr[arr.length - 1 - i];
      }
      return array;
   }

   // This method takes an integer array as a parameter and returns the smallest value in the array.
   public static int smallestValue(int[] arr) {
      int min = arr[0];
      // finds the smallest value in the array by comparing every value the the 
      for (int i = 0; i < arr.length - 1; i++) {
         if (min > arr[i]) {
            min = arr[i];
         }
      }
      return min;
   }
   
   // This method takes an integer array as a parameter and returns the largest value in the array.
   public static int largestValue(int[] arr) {
      int max = arr[0];
      // finds the largest value in the array by comparing every value the the array
      for (int i = 0; i < arr.length - 1; i++) {
         if (max < arr[i]) {
            max = arr[i];
         }
      }
      return max;
   }
   
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      
      // initialize variables
      int again = 1;
      int choice = 0;
      int[] arr = new int[0];
      
      // while again is 1, keep running the program. if it is not one stop the program
      do {
         while(choice < 1 || choice > 3) {
            System.out.print("1. Reverse an array\n2. Smallest element of an array\n3. Largest element of an array\nEnter your choice: ");
            choice = sc.nextInt();
            if (choice < 1 || choice > 3) {
               System.out.println("Please enter a number between 1 and 3");
            }
         }
         
         System.out.print("Enter the number of elements: ");
         arr = new int[sc.nextInt()];
         
         for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
         } 
         
         System.out.println("You entered: " + arrayToString(arr));
         switch (choice) {
            case 1:
               // if the person chose choice 1
               System.out.println("In reverse: " + arrayToString(reverseArray(arr)));
            break;
            
            case 2:
               // if the person chose choice 2
               System.out.println("Smallest value: " + smallestValue(arr));
            break;
            
            case 3:
               // if the person chose choice 3
               System.out.println("Biggest value: " + largestValue(arr));
            break;
         }
         
         System.out.print("Again? (1 for yes, 2 for no): ");
         again = sc.nextInt();
      } while (again == 1);
   }
}