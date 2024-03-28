//********************************************************************
//  BankTeller.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class BankTeller {
   private String name;
   private int tellerID;
   
   public BankTeller() {
      name = "";
      tellerID = 0;
   } 
   
   public BankTeller(String name, int tellerID) {
      this.name = name;
      this.tellerID = tellerID;
   }
   
   public String getName() { return name; }
   public int getTellerID() { return tellerID; }

   public void setName(String name) {this.name = name; }
   public void setTellerID(int tellerID) {this.tellerID = tellerID; }

   public String toString() {
      String result = "";
      result += "The bankteller's name is " + name + ".\n";
      result += "The bankteller's teller ID is " + tellerID + ".\n";
      
      return result;
   }
}