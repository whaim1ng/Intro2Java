/***
classwork30.java

max wang
***/

public class classwork30 {
   public static void main(String[] args) {
      //  reg array
      int[][] table1 = new int[9][9];
      
      for (int i = 0; i < table1.length; i++) {
         for (int j = 0; j < table1[i].length; j++) {
            table1[i][j] = (i+1)*(j+1);
         }
      }
      
      for (int i = 0; i < table1.length; i++) {
         for (int j = 0; j < table1[i].length; j++) {
            System.out.print(table1[i][j] + "\t");
         }
         System.out.println();
      }
      
      //jaggd array
      int[][] table2 = new int[9][];
      
      for (int i = 0; i < table2.length; i++) {
         table2[i] = new int[i + 1];
      }
      
      for (int i = 0; i < table2.length; i++) {
         for (int j = 0; j < table2[i].length; j++) {
            table2[i][j] = (i+1)*(j+1);
         }
      }
      
      for (int i = 0; i < table2.length; i++) {
         for (int j = 0; j < table2[i].length; j++) {
            System.out.print(table2[i][j] + "\t");
         }
         System.out.println();
      }
   }
}