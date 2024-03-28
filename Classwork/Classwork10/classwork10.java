//********************************************************************
//  classwork10.java       Author: Max Wang
//
//  java is so fun!!!!
//********************************************************************

public class classwork10 {
   public static void main (String[] args) {    
   // creates variables
      // original string
      String classwork = new String("pissdasdasdasdapsokdpkdaidjsoaidjas");
      
      // gets length of thing
      int classworkLength = classwork.length();
      
      // converts to uppercase(and stores)
      String upperClasswork = classwork.toUpperCase();
      
      // replaces (extra method one)
      String replace1 = "piss";
      String replace2 = "poo";
      String replaceClasswork = classwork.replace(replace1, replace2);
      
      // equals (extra method 2)
      String check1 = "pissdasdasdasdapsokdpkdaidjsoaidjas";
      boolean equals = classwork.equals(check1);
      
      // prints the results
      System.out.printf("first 3 char: %.3s"  + "\nlength: " + classworkLength + "\nuppercase: " + upperClasswork + "\nmethod 1: " + replaceClasswork + "\nmethod 2: " +  equals, classwork);
   }
}