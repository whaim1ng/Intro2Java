//********************************************************************
//  NHLPlayers.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class NHLPlayers {
   private String name;
   private int number;
   private String position;
   private String dateOfBirth;
   private String cityOfBirth;
   
   public NHLPlayers() {
      name = "";
      number = 0;
      position = "";
      dateOfBirth = "";
      cityOfBirth = "";   
   }
   
   public NHLPlayers(String setName, int setNumber, String setPosition, String setDateOfBirth, String setCityOfBirth) {
      name = setName;
      number = setNumber;
      position = setPosition;
      dateOfBirth = setDateOfBirth;
      cityOfBirth = setCityOfBirth;   
   }
   
   public String getName() { return name; }
   public int getNumber() { return number; }
   public String getPosition() { return position; }
   public String getDateOfBirth() { return dateOfBirth; }
   public String getCityOfBirth() { return cityOfBirth; }
   
   public void setName(String setName) { name = setName; }
   public void setNumber(int setNumber) { number = setNumber; }
   public void setPosition(String setPosition) { position = setPosition; }
   public void setDateOfBirth(String setDateOfBirth) { dateOfBirth = setDateOfBirth; }
   public void setCityOfBirth(String setCityOfBirth) { cityOfBirth = setCityOfBirth; }
   
   public String toString() {
      String result = "";
      result += "The player's name is " + name + ".\n";
      result += "The player's uniform number is " + number + ".\n";
      result += "The player's position is " + position + ".\n";
      result += "The was born in " + cityOfBirth + " on ." + dateOfBirth + ".\n";
      
      return result;
   }
   
}