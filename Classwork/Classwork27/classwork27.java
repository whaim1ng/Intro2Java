import java.util.*;

public class classwork27 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("how many grades are you planning to use?");
      int gradeAmt = sc.nextInt();
      
      int[] grades = new int[gradeAmt];
      
      System.out.println("type your " + gradeAmt + " grades to use");
      for (int i = 0; i < grades.length; i++) {
         System.out.print((i + 1)+ ". ");
         grades[i] = sc.nextInt();
      }
      
      System.out.print("your entered grades: ");
      for (int grade: grades) {
         System.out.print(grade + " ");
      }
      
      int ans = 0;
      
      for (int i = 0; i < grades.length; i++) {
         ans = ans + grades[i];
      }
      
      ans = ans/grades.length;
      System.out.println("");
      System.out.println("average: " + ans + "%");
      
   }
}