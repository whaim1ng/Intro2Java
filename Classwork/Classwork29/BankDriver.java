//********************************************************************
//  BankDriver.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class BankDriver {
   public static void main(String[] args) {
      // bank
      BankTeller frank = new BankTeller("frank", 1);      
      Branch east = new Branch("62 Great Neck Rd", "516-477-3232", frank, 1);
      
      // 3 tellers + 1 above = 4
      BankTeller jamie = new BankTeller();
      BankTeller ben = new BankTeller();
      BankTeller lisa = new BankTeller();
      
      east.addBanker(jamie);
      east.addBanker(ben);
      east.addBanker(lisa);
      
      // customer
      CustomerAccount brandon = new CustomerAccount("Brandon", 124, "4184120", 1032223, "Savings");
      System.out.println(brandon);
      
      brandon.setBalance(12);
      System.out.println("Brandon now has $" + brandon.getBalance());
      
      // deposit and stuff
      
      jamie.getBalance(brandon);
      
      jamie.withdrawl(brandon, 11);
      System.out.println("Brandon now has $" + brandon.getBalance());
      
      jamie.deposit(brandon, 11);
      System.out.println("Brandon now has $" + brandon.getBalance());
      
      jamie.withdrawl(brandon, 13);
      System.out.println("Brandon now has $" + brandon.getBalance());
      

      
      System.out.println("There are " + Branch.getBranchCount() + " branches and " + BankTeller.getTellerCount() + " tellers with " + Branch.getTellerCount() + " bankers in the " + east.getaddress() + " branch.");
   }
}