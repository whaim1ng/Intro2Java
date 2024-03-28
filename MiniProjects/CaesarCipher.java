//********************************************************************
//  CaesarCipher.java       Author: Max Wang
//
//  java is so fun!!!!
//********************************************************************
import java.util.*;

public class CaesarCipher {
   // A: 65 | Z: 90
   // a: 97 | z: 122
   
   // takes a string and an int as parameters and returns a string where eacho of the characters in the original has been shifited the SHIFT number of characters
   public static String encode(String str, int shift) {
      String ans = "";
      
      while (shift > 26) {
         // makes it so that the numbers are easier to work with(its like saying sin(2pi) = sin(0)) 
         shift = shift - 26;
      }
      if (shift == 26) {
         // reuturns the string by itself if the shift number = 26
         return str;
      }
      
      // shifts the string by shift letter by letter
      for (int i = 0; i < str.length(); i++) {      
         // both cases for lowercase and uppercase   
         if (str.charAt(i) + shift > 90 && str.charAt(i) <= 90 || str.charAt(i) + shift > 122 && str.charAt(i) >= 97) {
            ans = ans + (char)(str.charAt(i) + shift - 26);      
         } else { 
            // will be ran if there is no loop around back to the original letter
            ans = ans + (char)(str.charAt(i) + shift);
         }
      }
      
      return ans;
   }
   
   // takes a string and an int as parameters and returns a string where eacho of the characters in the original has been shifited the -SHIFT number of characters
   public static String decode(String str, int shift) {
      String ans = "";
      
      // makes the numbers easier to work with(said above)
      if (shift == 26) {
         return str;
      }
      while (shift > 26) {
         shift = shift - 26;
      }
      
      // shifts the word by shift amount letter by letter
      for (int i = 0; i < str.length(); i++) {
         // makes a case for both lowercase and uppercase
         if (str.charAt(i) - shift < 65 && str.charAt(i) <= 90 || str.charAt(i) - shift < 97 && str.charAt(i) >= 97) {
            ans = ans + (char)(str.charAt(i) - shift + 26);      
         } else { 
            // this will be ran if there is no loop made
            ans = ans + (char)(str.charAt(i) - shift);
         }
      }
      
      return ans;
   }
   
   public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      
      // initializes shift as a negative number for the while loop to work
      int choice, shift = -1;     
      
      // takes inpit
      System.out.println("1. Encode\n2. Decode");
      choice = sc.nextInt();
      System.out.print("Word being shifted: ");
      String str = sc.next();
      
      // you cannot shift by a negative number
      while (shift < 0) {
         System.out.println("Amount of letters being shifted?");
         shift = sc.nextInt();
         if (shift < 0) {
            System.out.println("Choose a non-negative integer");
         }
      }
      
      switch(choice) {
         case 1:
            System.out.println(encode(str, shift));
         break; 
         
         case 2:
            System.out.println(decode(str, shift));
         break;         
      }  
      
//        System.out.println(encode("HELLO", 5)); // gives MJQQT
//        System.out.println(decode("WORLD", 5)); // gives RJMGY
//        System.out.println(encode(decode("HELLO", 5), 5)); //gives HELLO
   }
}