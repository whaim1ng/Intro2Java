//********************************************************************
//  Bank.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class Bank {
   private String name;
   private Branch branch;   
   
   public Bank() {
      name = "";
      branch = null;
   } 
   
   public Bank(String name, Branch branch) {
      this.name = name;
      this.branch = branch;
   }
   
   public String getName() { return name; }
   public String getBranch() { return branch.toString(); }

   public void setName(String name) {this.name = name; }
   public void setBranch(Branch branch) {this.branch = branch; }   

   public String toString() {
      String result = "";
      result += "The Bank's name is " + name + ".\n";
      result += "Branch Info:\n" + branch;
      result += "There are " + Branch.getBranchCount() +  " branches.";
      
      return result;
   }
}