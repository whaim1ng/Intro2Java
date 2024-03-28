//********************************************************************
//  Branch.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class Branch {
   private String address;
   private String phoneNum;
   private BankTeller[] banker;
   private static int tellerCount;
   private static int branchCount;
   
   public Branch() {
      address = "";
      phoneNum = "";
      banker = new BankTeller[100];
      tellerCount = 0;
      branchCount++;
   } 
   
   public Branch(String address, String phoneNum, BankTeller newBanker, int bankerCount) {
      this.address = address;
      this.phoneNum = phoneNum;
      banker = new BankTeller[bankerCount];
      banker[0] = newBanker;
      tellerCount = 1;
      branchCount++;
   }
   
   public String getaddress() { return address; }
   public String getPhoneNum() { return phoneNum; }
   public String getBanker() { return banker.toString(); }
   
   public static int getTellerCount() { return tellerCount; }
   public static int getBranchCount() { return branchCount; }

   public void addBanker(String name, int tellerID) {
      if (banker.length == tellerCount) increaseSize();
      banker[tellerCount] = new BankTeller(name, tellerID);
      tellerCount++;
   }
   
   public void addBanker(BankTeller newBanker) {
      if (banker.length == tellerCount) increaseSize();
      banker[tellerCount] = newBanker;
      tellerCount++;
   }

   public void setaddress(String address) {this.address = address; }
   public void setPhoneNum(String phoneNum) {this.phoneNum = phoneNum; }

   public String toString() {
      String result = "";
      result += "The Branch's address is " + address + ".\n";
      result += "The Branch's phone number is " + phoneNum + ".\n";
      
      result += "Banker infos:\n" + banker;
      result += "There are " + BankTeller.getTellerCount() +  " bank tellers in this branch.";
      
      return result;  
   }
   
   private void increaseSize() {
      BankTeller[] temp = new BankTeller[banker.length * 2];
      
      for (int i = 0; i < banker.length; i++) temp[i] = banker[i];
      
      banker = temp;
   }
}