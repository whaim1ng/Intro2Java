//********************************************************************
//  StudentInfo.java       Author: Max Wang
//
//  
//********************************************************************

public class StudentInfo {
   private String name;
   private int GPA;
   private int mathGrade;
   private boolean passedAlgebra;
   
   public StudentInfo() {
      name = "";
      GPA = 0;
      mathGrade = 0;
      passedAlgebra = false;
   }   
   
   public StudentInfo(String sName) {
      name = sName;
      GPA = 0;
      mathGrade = 0;
      passedAlgebra = false;
   }
   
   public String getName() { return name; }
   public int getGPA() { return GPA; }
   public int getMathGrade() { return mathGrade; }
   public boolean getPassedAlgebra() { return passedAlgebra; }
   
   public void setName(String setName) { name = setName; }
   public void setGPA(int setGPA) { GPA = setGPA; }
   public void setMathGrade(int setMathGrade) { mathGrade = setMathGrade; }
   public void setPassedAlgebra(boolean setPassedAlgebra) { passedAlgebra = setPassedAlgebra; }
    
   public String toString() {
      String result = "";
      result += "The student's name is " + name + ".\n";
      result += "Their GPA is " + GPA + ".\n";
      result += "Their Math Grade " + mathGrade + ".\n";
      if (passedAlgebra) { result += "They have passed Algebra"; } else { result += "They have not passed Algebra"; }   
      
      return result;     
   }

}