//********************************************************************
//  classwork15c.java       Author: Max Wang
//
//  java is so fun!!!!
//  high = 0, low = 1
//********************************************************************
import javax.swing.JOptionPane;

public class classwork15c {  
   public static void main(String[] args) {
      int guess = 100, difference, selection = 1, tries = 0;
      String[] options = {"higher", "lower", "that is my number"};
      
      // tells user to think of a number
      JOptionPane.showMessageDialog(null, "think of a number between 0 - " + guess);
      difference = guess/2;
      
      // sets the guess = 50 in this case
      guess = guess/2;
      
      // while selection the user hasnt chosen "that is my number"
      while(selection != -1) {
         // opens the window for JOptionPane
         selection = JOptionPane.showOptionDialog(null, ("is this number higher or lower than "  + guess), "guessing your number", 0, 2, null, options, options[0]);
         
         if (selection == 0) {
            difference = difference/2 + 1;
            guess = guess + difference;
         } else if (selection == 1) {
            difference = difference/2;
            guess = guess - difference - 1;
         } else if (selection == 2) {
            selection = -1;
         }
         
         tries++;
      }
      
      JOptionPane.showMessageDialog(null, "it took me " + (tries - 1) + " tries!!");  
   }
}