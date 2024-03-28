//********************************************************************
//  NHLTeam.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class NHLTeam {
   private String name;
   private int years;
   private String conferenceAffiliation;
   private String divisionAffiliation;
   NHLPlayers player1 = new NHLPlayers();
   Arena arena = new Arena();
   
   public NHLTeam() {
      name = "";
      years = 0; 
      conferenceAffiliation = "";
      divisionAffiliation = "";
   }
   
   public NHLTeam(String setName, int setYears, String setConferenceAffiliation, String setDivisionAffiliation) {
      name = setName;
      years = setYears;
      conferenceAffiliation = setConferenceAffiliation;
      divisionAffiliation = setDivisionAffiliation;
   }
   
   public String getName() { return name; }
   public int getYears() { return years; }
   public String getConferenceAffiliation() { return conferenceAffiliation; }
   public String getDivisionAffiliation() { return divisionAffiliation; }
   
   public void setName(String setName) {name = setName; }
   public void setYears(int setYears) { years = setYears; }
   public void setConferenceAffiliation(String setConferenceAffiliation) { conferenceAffiliation = setConferenceAffiliation; }
   public void setDivisionAffiliation(String setDivisionAffiliation) { divisionAffiliation = setDivisionAffiliation; }
   
   public String toString() {
      String result = "";
      result += "The team's name is " + name + ".\n";
      result += "The team has existed for " + years + " years.\n";
      result += "The team's conference affiliateion is " + conferenceAffiliation + ".\n";
      result += "The team's division affiliation is "  + divisionAffiliation + ".\n";
      result += "The team plays in " + arena.getName + ".\n"; 
      
      return result;
   }
}