//********************************************************************
//  CustomerAccount.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class CustomerAccount {
   private String name;
   private int accountNum;
   private String IDNumber;
   private double balance;
   private String accountType;
   
   public CustomerAccount() {
      name = "";
      accountNum = 0;
      IDNumber = "";
      balance = 0;
      accountType = "";
   }
   
   public CustomerAccount(String name, int accountNum, String IDNumber, double balance, String accountType) {
      this.name = name;
      this.accountNum = accountNum;
      this.IDNumber = IDNumber;
      this.balance = balance;
      this.accountType = accountType;
   }
   
   public String getName() { return name; }
   public int getAccountNum() { return accountNum; }
   public String getIDNumber() { return IDNumber; }
   public double getBalance() { return balance; }
   public String getAccountType() { return accountType; }
   
   public void setName(String name) { this.name = name; }
   public void setAccountNum(int accountNum) { this.accountNum = accountNum; }
   public void setIDNumber(String IDNumber) { this.IDNumber = IDNumber; }
   public void setBalance(double balance) { this.balance = balance; }
   public void setAccountType(String accountType) { this.accountType = accountType; }
   
   public String toString() {
      String result = "";
      result += "The customer's name is " + name + ".\n";
      result += "The customer's account number is " + accountNum + ".\n";
      result += "The customer's ID number is " + IDNumber + ".\n";
      result += "The customer's balance is " + balance + ".\n";
      result += "The customer's account type is a " + accountType + " account.\n";                        
      
      return result;
   } 
   
}