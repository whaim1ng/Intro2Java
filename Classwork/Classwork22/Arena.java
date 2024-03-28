//********************************************************************
//  Arena.java       Author: Max Wang
//
//  
//********************************************************************
import java.util.*;

public class Arena {
   private String name, location, team1;
   private int seats;
   
   public Arena() {
      name = "";
      location = "";
      team1 = "";
      seats = 0;
   }
   
   public Arena(String setName) {
      name = setName;
      location = "";
      team1 = "";
      seats = 0;
   }

   public Arena(String setName, String setLocation, String getName1, String getName2, int setSeats) {
      name = setName;
      location = setLocation;
      team1 = getName1;
      seats = setSeats;
   }
   
   private String getName() { return name; }
   private String getLocation() { return location; }
   private String getTeam1() { return team1; }
   private int getSeats() { return seats; }
   
   private void setName(String setName) { name = setName; }
   private void setLocation(String setLocation) { location = setLocation; }
   private void setTeam1(String setTeam1) { team1 = setTeam1; }
   private void setSeats(int setSeats) { seats = setSeats; }
   
   public String toString() {
      String result = "";
      result += "The arena's name is " + name + ".\n";
      result += "The arena's location is " + location + ".\n";
      result += team1 + " is playing.\n";
      result += "The arena as " + seats + " seats.\n";
            
      return result;
   }
}  