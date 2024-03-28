//********************************************************************
//  CozaLozaWoza.java       Author: Max Wang
//
//  prints "Coza" in place of the numbers which are multiples of 3, "Loza" for multiples of 5,
//  "Woza" for multiples of 7
//  "CozaLoza" for multiples of 3 and 5, and so on.
//
//  java is so fun!!!!
//********************************************************************
import javax.swing.JOptionPane;

public class CozaLozaWoza {
   public static String cozaLozaWoza(int n) {
      // initializes all the strings needed
      // ascii 10 is newline
      char line = 10;
      String coza = "Coza", loza = "Loza", woza = "Woza", ans = "", translated = "";
      
      for (int i = 1; i <= n; i++) {
         
         // if the conditions are met, translated will be added onto the string that will be added onto the answer string
         if (i % 3 == 0) {
            translated = translated + coza;
         }
         
         if (i % 5 == 0) {
            translated = translated + loza;
         }
         
         if (i % 7 == 0) {
            translated = translated + woza;
         }
         
         // add the string onto the answer string -- if the answers are not met, the integer will be added
         if (i % 3 == 0 || i % 5 == 0 || i % 7 == 00) {
            ans = ans + translated + " ";
         } else {
            ans = ans + i + " ";
         }
         
         // 11 numbers per line
         if (i % 11 == 0) {
            ans = ans + line;
         }
         
         // resets translated so that it can be formed again
         translated = "";
      }
      
      return ans;
   }
   
   public static void main(String[] args) {
      // declares the variables needed
      int input;
      int again = 0;
      
      // while the user wants to run the program again, keep running the methods and stuff
      while (again == 0) {
         // gets the input integer
         input = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer."));
         
         // shows the output string
         JOptionPane.showMessageDialog(null, cozaLozaWoza(input));
         
         // asks the user if they wanna run the program again
         again = JOptionPane.showConfirmDialog(null, "Again?", "", JOptionPane.YES_NO_OPTION);
      }      
   }

}