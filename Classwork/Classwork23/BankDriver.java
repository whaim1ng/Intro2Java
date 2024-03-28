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
   }
}