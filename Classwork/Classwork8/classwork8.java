//********************************************************************
//  classwork8.java       Author: Max Wang
//
//  java is so fun!!!!
//********************************************************************

public class classwork8 {
   public static void main (String[] args) {
      // declares variables
      double x = 1;
      double y = 2;
      int a = 3;
      int b = 4;
      
      double z = Math.max(x-y, y-x);
      int c = a*b;
      
      // prints the results
      System.out.println(z);
      System.out.println(c);
      c = a/b;
      System.out.print(c);
      c = a%b;
      System.out.print(" R" + c);
   }
}