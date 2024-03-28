//********************************************************************
//  GNSStudentDriver.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class GNSStudentDriver {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   
      System.out.println("what is the student's name");
      GNSStudent GNSStudent = new GNSStudent(sc.nextLine());
      
      System.out.println("What is the student's street address?");
      GNSStudent.setAddress(sc.nextLine());
      
      System.out.println("What city does the student live in?");
      GNSStudent.setCity(sc.nextLine());
      
      System.out.println("What state does the student live in?");
      GNSStudent.setState(sc.nextLine());      
      
      System.out.println("What is the student's zip code?");
      GNSStudent.setZip(sc.nextInt());
      
      System.out.println("What is the student's id number?");
      sc.nextLine();GNSStudent.setId(sc.nextLine());
      
      System.out.println("What is the student's exam1 grade?");
      GNSStudent.setExam1(sc.nextInt());
      
      System.out.println("What is the student's exam2 grade?");
      GNSStudent.setExam2(sc.nextInt());
      
      System.out.println("What is the student's exam3 grade?");
      GNSStudent.setExam3(sc.nextInt());
      
      System.out.println("What is the student's exam4 grade?");
      GNSStudent.setExam4(sc.nextInt());
      
      System.out.println("What is the student's final exam grade?");
      GNSStudent.setFinalExam(sc.nextInt());
      
      System.out.println("What is the student's participation grade?");
      GNSStudent.setParticipation(sc.nextInt());
      
      
      System.out.println(GNSStudent);
   }
}