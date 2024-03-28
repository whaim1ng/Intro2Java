//********************************************************************
//  StudentInfoDriver.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class StudentInfoDriver {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   
      System.out.println("what is the student's name");
      StudentInfo studentInfo = new StudentInfo(sc.nextLine());
      
      System.out.println("what is the student's GPA");
      studentInfo.setGPA(sc.nextInt());
      
      System.out.println("what is the student's math grade?");
      studentInfo.setMathGrade(sc.nextInt());
      
      System.out.println("has the student passed algebra(t/f)");
      char in = sc.next().charAt(0);
      // t = 116 f = 102
      if (in == 116) {
         studentInfo.setPassedAlgebra(true);
      } else if (in == 102) {
         studentInfo.setPassedAlgebra(false);
      }
      
      System.out.println(studentInfo);
   }
}