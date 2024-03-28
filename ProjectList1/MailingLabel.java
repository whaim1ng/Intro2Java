//********************************************************************
//  MailingLabel.java       Author: Max Wang
//
//  Asks the user to input their chosen delimiter. The delimiter does NOT need to be a single character (it can be a word).
//  Asks the user to input the delimited string, which holds a person’s name and address, as input
//  Prints a mailing label as output.
//
//  java is so fun!!!!
//********************************************************************
import javax.swing.JOptionPane;

public class MailingLabel { 
   public static String mailingLabel(String str, String del) {
      // declares variables needed
      // check must be the same length as del
      String ans = "", check = "";
      char print = 'a';
      
      // change the value in check to be the letters being checked
      // i is the first letter being checked
      // j is the second letter and all the following
      for (int i = 0; i < str.length() - del.length(); i++) {
         // creates the string being checked
         for (int j = 0; j < del.length(); j++) {
            // creates the letters being checked
            check = check + str.charAt(j + i);
         }
         
         // compare check and del every time a check string is finished
         if (del.compareTo(check) == 0) {
            // puts the characters that are not the delimiter into ans
            print = 10;
            i = i + del.length() - 1;
         } else {
            // puts the characters that are not the delimiter into ans
            print = check.charAt(0);
         }
         
         // adds the character needing to be printed into ans
         ans = ans + print;
                     
         // resets check so that another line can be created
         check = "";
      }           
      
      // adds the rest of the letters from the end to the ans
      for (int i = str.length() - del.length(); i < str.length(); i++) {
         ans = ans + str.charAt(i);
      }
      
      return ans;
   }
      
   public static void main (String[] args) {
      // declares the variables needed
      String str, del;
      int again = 0;
      
      // while the user wants to run the program again, keep running the methods and stuff
      while (again == 0) {
         // gets the input strings
         del = JOptionPane.showInputDialog("enter your delimiter");
         str = JOptionPane.showInputDialog("enter your delimited string");
         
         // shows the output string
         JOptionPane.showMessageDialog(null, mailingLabel(str, del));
         
         // asks the user if they wanna run the program again
         again = JOptionPane.showConfirmDialog(null, "Again?", "", JOptionPane.YES_NO_OPTION);
      }
   }
}