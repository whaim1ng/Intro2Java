//********************************************************************
//  Palindrome.java       Author: Max Wang
//
//  User is asked for the string to be processed, the verse is correctly determined, and the answer is correct as to palindrome or not.
//
//  java is so fun!!!!
//********************************************************************
import javax.swing.JOptionPane;

public class Palindrome { 
   // returns the reverse of the String that the user entered
   public static String reverseString(String str) {
      // declares variables needed
      String input = str, ans = "";
      char letter;
      
      // adds characters to answer string starting from the last letter
      for (int i = input.length() - 1; i >= 0; i--) {
         letter = input.charAt(i);
         ans = ans + (char)letter;
      }
      
      return ans;
   }
   
   // returns true if the user entered a palindrome, false if they did not
   public static boolean isPalindrome(String str) {
      // if the palindrom and the string are the same, return true
      if (str.compareTo(reverseString(str)) == 0) {
         return true;
      }
      return false;
   }
   
   public static void main(String[] args) {
      // declares the variables needed
      String str;
      int again = 0;
      
      // while the user wants to run the program again, keep running the methods and stuff
      while (again == 0) {
         // gets the input string
         str = JOptionPane.showInputDialog("Enter a string");
         
         // shows the output string
         JOptionPane.showMessageDialog(null, "The reverse of the string is " + reverseString(str));
         JOptionPane.showMessageDialog(null, "It is a palindrome: " + isPalindrome(str));
         
         // asks the user if they wanna run the program again
         again = JOptionPane.showConfirmDialog(null, "Again?", "", JOptionPane.YES_NO_OPTION);
      }      
   }
}