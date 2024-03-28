//********************************************************************
//  Pokedex.java       Author: Max Wang
//
//  
//********************************************************************

public class Pokedex {
   private String name;
   private int number;
   private String type;
   private int health;
   private int level;
   
   public Pokedex() {
      name = "";
      number = 0;
      type = "";
      health = 0;
      level = 0;
   }   
   
   public Pokedex(String pName) {
      name = pName;
      number = 0;
      type = "";
      health = 0;
      level = 0;
   }
   
   public String getName() { return name; }
   public int getNumber() { return number; }
   public String getType() { return type; }
   public int getHealth() { return health; }
   public int getLevel() { return level; }
   
   public void setName(String setName) { name = setName; }
   public void setNumber(int setNumber) { number = setNumber; }
   public void setType(String setType) { type = setType; }
   public void setHealth(int setHealth) { health = setHealth; }
   public void setLevel(int setLevel) { level = setLevel; }
    
   public String toString() {
      String result = "";
      result += "My name is " + name + ".\n";
      result += "My number is " + number + ".\n";
      result += "My type is " + type + ".\n";
      result += "I have " + health +  " health.\n";
      result += "I have " + level + " levels.\n";
   
      return result;     
   }
   
   public void levelUp() {
      level++;
   }
   
   public boolean hasFainted() {
      if (health <= 0) {
         return true;
      }
      
      return false;
   }
   
   public String speak() {
      return name + " " + name + "!!";
   }
}