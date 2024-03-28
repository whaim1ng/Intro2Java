//********************************************************************
//  BankDriver.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class BankDriver {
   public static void main(String[] args) {
      // bank
      BankTeller flora = new BankTeller("flora", 249148);
      Branch greatNeckBranch = new Branch("Great Neck", "351-252-5152", flora);
      Bank chase = new Bank("Chase", greatNeckBranch);
      System.out.println(chase);
      
      greatNeckBranch.setPhoneNum("241-211-5253");
      System.out.println(chase);
      
      flora.setTellerID(16);
      System.out.println(chase);
      
      
      // customer
      CustomerAccount brandon = new CustomerAccount("Brandon", 124, "4184120", 1032223, "Savings");
      System.out.println(brandon);
      
      brandon.setBalance(12);
      System.out.println("Brandon now has $" + brandon.getBalance());
      
      // deposit and stuff
      
      flora.getBalance(brandon);
      
      flora.withdrawl(brandon, 11);
      System.out.println("Brandon now has $" + brandon.getBalance());
      
      flora.deposit(brandon, 11);
      System.out.println("Brandon now has $" + brandon.getBalance());
      
      flora.withdrawl(brandon, 13);
      System.out.println("Brandon now has $" + brandon.getBalance());
      
      // counts of branches and tellers
      
      // 2 branches + 1 above = 3
      Branch east = new Branch();
      Branch west = new Branch();
      
      // 3 tellers + 1 above = 4
      BankTeller jamie = new BankTeller();
      BankTeller ben = new BankTeller();
      BankTeller lisa = new BankTeller();
      
      System.out.println("There are " + Branch.getBranchCount() + " branches and " + BankTeller.getTellerCount() + " tellers.");
   }
}