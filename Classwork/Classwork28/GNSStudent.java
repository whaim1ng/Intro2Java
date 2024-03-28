//********************************************************************
//  GNSStudent.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class GNSStudent {
   // name
   private String name;
   // address
   private String address;
   private String city;
   private String state;
   private int zip;
   // ID number
   private String id;
   // average
   private int[] exams = new int[4];
   private int finalExam;
   private int participation;
   private int average;
   // quality points
   private int quality;
   
   public GNSStudent() {
      name = "";
      address = "";
      city = "";
      state = "";
      zip = 0;
      average = 0;
      
      for (int i = 0; i < exams.length; i++) {
         exams[i] = 0;
      }
      
      id = "";
      finalExam = 0;
      participation = 0;
      
      if (90 <= average && average <= 100) {
         quality = 4;
      } else if (80 <= average && average < 90) {
         quality = 3;
      } else if (70 <= average && average < 80) {
         quality = 2;
      } else if (65 <= average && average < 70) {
         quality = 1;
      } else if ( average < 65) {
         quality = 0;
      }        
   }
   
   public GNSStudent(String sName) {
      name = sName;
      address = "";
      city = "";
      state = "";
      zip = 0;
      average = 0;
      
      for (int i = 0; i < exams.length; i++) {
         exams[i] = 0;
      }
      
      id = "";
      finalExam = 0;
      participation = 0;
      
      for (int grade: exams) {
         average = average + grade;
      }
      average = ((4*((average + 2*finalExam)/6)) + (participation/100))/5;
      
      if (90 <= average && average <= 100) {
         quality = 4;
      } else if (80 <= average && average < 90) {
         quality = 3;
      } else if (70 <= average && average < 80) {
         quality = 2;
      } else if (65 <= average && average < 70) {
         quality = 1;
      } else if ( average < 65) {
         quality = 0;
      }        
   }
   
   
   // get
   public String getName() { return name; }
   public String getAddress() { return address; }
   public String getCity() { return city; }
   public String getState() { return state; }
   public int getZip() { return zip; }
   public String getId() { return id; }
   public int getExam1() { return exams[0]; }
   public int getExam2() { return exams[1]; }
   public int getExam3() { return exams[2]; }
   public int getExam4() { return exams[3]; }
   public int getFinalExam() {  return finalExam;}
   public int getAverage() { return ((4*((exams[0] + exams[1] + exams[2] + exams[3] + 2*finalExam)/6)) + (participation/100))/5;}
   public int getParticipation() { return participation; }
   public int getQuality() {
      if (90 <= average && average <= 100) {
         quality = 4;
      } else if (80 <= average && average < 90) {
         quality = 3;
      } else if (70 <= average && average < 80) {
         quality = 2;
      } else if (65 <= average && average < 70) {
         quality = 1;
      } else if ( average < 65) {
         quality = 0;
      }     
      return quality;
   }
   
   // set   
   public void setName(String setName) { name = setName;}
   public void setAddress(String setAddress) { address = setAddress; }
   public void setCity(String setCity) { city = setCity; }
   public void setState(String setState) { state = setState; }
   public void setZip(int setZip) { zip = setZip; }
   public void setId(String setId) { id = setId; }
   public void setExam1(int setExam1) { exams[0] = setExam1; }
   public void setExam2(int setExam2) { exams[1] = setExam2; }
   public void setExam3(int setExam3) { exams[2] =setExam3; }
   public void setExam4(int setExam4) { exams[3] = setExam4; }
   public void setFinalExam(int setFinalExam) { finalExam = setFinalExam; }
   public void setParticipation(int setParticipation) { participation = setParticipation; }
   
   public String toString() {
      String result = "";
      
      average = ((4*(((exams[0] + exams[1] + exams[2] + exams[3]) + 2*finalExam)/6) + (participation)))/5;
      
      if (90 <= average && average <= 100) {
         quality = 4;
      } else if (80 <= average && average < 90) {
         quality = 3;
      } else if (70 <= average && average < 80) {
         quality = 2;
      } else if (65 <= average && average < 70) {
         quality = 1;
      } else if ( average < 65) {
         quality = 0;
      }       
      
      result += "The student's name is " + name + ".\n";
      result += "Their address is " + address + ", " + city + ", " + state + " "+ zip + ".\n";
      result += "Their ID is " + id + ".\n";
      result += "Their average is " + average + ".\n";
      result += "They have " + quality + " quality points.\n";
      
      return result;     
   }
}