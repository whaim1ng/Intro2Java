//********************************************************************
//  PokedexDriver.java       Author: Max Wang
//
//  
//********************************************************************

public class PokedexDriver {   
   public static void main(String[] args) {
      Pokedex mimikyu = new Pokedex("mimikyu");
     
      mimikyu.setNumber(778);
      mimikyu.setType("posion");
      mimikyu.setHealth(78);
      mimikyu.setLevel(241);
      
      System.out.println(mimikyu);
      
      System.out.println(mimikyu.hasFainted());      
      
      System.out.println(mimikyu.speak());
      
      mimikyu.setHealth(0);
      
      System.out.println(mimikyu.hasFainted());
   }
}