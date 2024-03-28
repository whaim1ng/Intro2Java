//********************************************************************
//  sumRange.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class sumRange {
   public static int sumRange(int a, int b) {
      int sum = 0;
      
      if (b < a) { return 0; }
      
      for (int i = a; i <= b; i++) {
         sum = sum + i;
      }
      
      return sum;
   }
   
   public static int sumRange(double a, double b) {
      int sum = 0;
      
            if (b < a) { return 0; }if (b < a) { return 0; }
      
      for (int i = (int)Math.ceil(a); i <= (int)b; i++) {
         sum = sum + i;
      }
      
      return sum;
   }
   
   public static void main(String[] args) {   
      System.out.println(sumRange(3, 5));
      System.out.println(sumRange(3.1, 5));
   }
}