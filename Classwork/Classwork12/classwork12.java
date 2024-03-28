//********************************************************************
//  classwork12.java       Author: Max Wang
//
//  java is so fun!!!!
//********************************************************************
import java.util.*;

public class classwork12 {
   public static void main (String args[]) {
      Scanner sc = new Scanner(System.in);
      
      // instruction 1
      int in1 = sc.nextInt();
      if (in1 % 3 == 0) {
         System.out.println(in1 + " is divisible by 3!");
      } else {
         System.out.println(in1 + " is not divisible by 3!");
      }
      
      // instruction 2
      if (in1 % 2 == 0) {
         System.out.println(in1 + " is even!");
      } else {
         System.out.println(in1 + " is odd!");
      }
      
      // instruction 3 
         // rules:
         // Start with letter "U"
         // Be more than 6 characters in length
      String username = sc.nextLine(); username = sc.nextLine();
      int usernameLength = username.length();
      char usernameChar = username.charAt(0);
      char usernameReq = 'U';
      
      if (usernameLength > 6 && usernameChar == usernameReq) {
         System.out.println("All set!");
      } else if (usernameLength <= 6) {
         System.out.println("Please enter a username longer than 6 characters!");
      } else if (usernameChar != usernameReq) {
         System.out.println("Your username must start with a U!");
      } else {
         System.out.println("what did you just do");
      }
   }
}