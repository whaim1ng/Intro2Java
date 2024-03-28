//********************************************************************
//  Branch.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class Branch {
   private String address;
   private String phoneNum;
   private BankTeller banker;
   private static int branchCount = 0;
   
   public Branch() {
      address = "";
      phoneNum = "";
      banker = null;
      branchCount++;
   } 
   
   public Branch(String address, String phoneNum, BankTeller banker) {
      this.address = address;
      this.phoneNum = phoneNum;
      this.banker = banker;
      branchCount++;
   }
   
   public String getaddress() { return address; }
   public String getPhoneNum() { return phoneNum; }
   public String getBanker() { return banker.toString(); }
   
   public static int getBranchCount() { return branchCount; }

   public void setaddress(String address) {this.address = address; }
   public void setPhoneNum(String phoneNum) {this.phoneNum = phoneNum; }
   public void setBanker(BankTeller banker) {this.banker = banker; }

   public String toString() {
      String result = "";
      result += "The Branch's address is " + address + ".\n";
      result += "The Branch's phone number is " + phoneNum + ".\n";
      result += "Banker info:\n" + banker;
      result += "There are " + BankTeller.getTellerCount() +  " bank tellers.";
      
      return result;  
   }
}