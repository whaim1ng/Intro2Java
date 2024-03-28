//********************************************************************
//  classwork14.java       Author: Max Wang
//
//  java is so fun!!!!
//********************************************************************


public class classwork14 {
   public static void main(String[] args) {
      // initializes digit places
      int tens = 1, ones = 0;
      
      // nested while loop to count   
      while (tens <= 4) { 
         while (ones <= 9) {
            System.out.println("" + tens + ones);
            ones++;
         }
         tens++;
         ones = 0;
      }
      System.out.println("5" + "0");
   }
}