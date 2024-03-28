//********************************************************************
//  classwork13.java       Author: Max Wang
//
//  java is so fun!!!!
//********************************************************************
import java.util.*;

public class classwork13 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      // step one
      int x = 7, x1 = 7;
      int y = x++;
      int y1 = ++x1;
      System.out.println("x: " + x + " x1: " + x1 + " y: " + y + " y1: " + y1 );
      
      // x++ returns x and then makes x = x+1
      // ++x makes x = x+1 and then returns x
      
      // step two
      String str1 = "h", str2 = "hii";
      System.out.println(str1.compareTo(str2));
      // the value is positive when the first string that is being compared has more characters than the second string
      // the value is negetive when the first string that is being compared has less characters than the second string
      // the value is 0 when the first and second value have the same number of characters
      
      // step three
      int grade = 1000;
      grade = sc.nextInt();
      char letterGrade = 'A';
      
      while (grade >= 100) {
         if (grade >= 100) {
            System.out.println("type a grade less than 100 please");
            grade = sc.nextInt();
         } else if (grade >= 94) {
            letterGrade = 'A';
         } else if (grade >= 85) { 
            letterGrade = 'B';         
         } else if (grade >= 75) {
            letterGrade = 'C';        
         } else if (grade >= 60) {
             letterGrade = 'D';        
         } else {
            letterGrade = 'F';
         }
      }
      
      System.out.println("You received a letter grade of " + letterGrade);
      
   }
}