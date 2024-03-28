//********************************************************************
//  Zinnformatics.java       Author: Max Wang
//
//  Zinnformatics Products, Inc. is selling a web-design software package that retails for $99.00.
//  Have the user input the company name.
//  Have the user input the number of packages that they would like to order.
//  Output a final “invoice” through a message box
//
//  java is so fun!!!!
//********************************************************************
import javax.swing.JOptionPane;

public class Zinnformatics {
   // returns the total cost of all the product
   public static double zinnformatics(int quantity) {
      double discount;
      
      if (quantity >= 10 && quantity <= 19) {
         discount = 0.8;
      } else if (quantity > 19 && quantity <= 49) {
         discount = 0.7;
      } else if (quantity > 49 && quantity <= 99) {
         discount = 0.6;
      } else if (quantity > 99) {
         discount = 0.5;
      } else {
         discount = 1;
      }
      
   
      return quantity * 99 * discount;
   }
   
   // returns the decimal value of the total items, not as percent
   public static double discount(int quantity) {
      double ans; 
      
      // if the quantity is in between the two values, then the discount is whatever it may be
      if (quantity >= 10 && quantity <= 19) {
         ans = 0.2;
      } else if (quantity > 19 && quantity <= 49) {
         ans = 0.3;
      } else if (quantity > 49 && quantity <= 99) {
         ans = 0.4;
      } else if (quantity > 99) {
         ans = 0.5;
      } else {
         ans = 0;
      }
      
      return ans;
   }
   
   public static void main (String args[]) {
      String company;
      int quantity; 
      
      // inputs
      company = JOptionPane.showInputDialog(null, "What is the name of your company?");
      quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "How many packages would you like to order?"));
      
      // message
      JOptionPane.showMessageDialog(null, "Thank you for your order " + company + ". You ordered " + quantity + " packages at a " + String.format("%.1f", discount(quantity) * 100) + "% discount. Your final cost will be $" + String.format("%.2f", zinnformatics(quantity)));
     
   }
}