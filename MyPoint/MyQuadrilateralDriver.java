//********************************************************************
//  MyQuadrilateralDriver.java       Author: Max Wang
//
//  driver for MyQuadrilateral
//********************************************************************

import java.util.*;

public class MyQuadrilateralDriver {
   public static void main(String[] args) {
      // intializes result string
      String res = "";
      
      // Quadrilateral 1
      MyQuadrilateral ABCD = new MyQuadrilateral(new MyPoint(3, 4), new MyPoint(4, 7), new MyPoint(2, 8), new MyPoint(-1, 5), "ABCD");

      // Quadrilateral 2
      MyQuadrilateral EFGH = new MyQuadrilateral(new MyPoint(-2, 1), new MyPoint(3, 2), new MyPoint(1, 6), new MyPoint(-3, 7), "EFGH");
      
      // prints results
      res += "Triangle " + ABCD.getName() + ": " + ABCD.toString() + "\n";
      res += "Triangle " + EFGH.getName() + ": " + EFGH.toString() + "\n";
      res += "Perimeter (" + ABCD.getName() + "): " + ABCD.findPerimeter() + "\n";
      res += "Perimeter (" + EFGH.getName() + "): " + EFGH.findPerimeter() + "\n";
      res += "Area (" + ABCD.getName() + "): " + ABCD.findArea() + "\n";
      res += "Area (" + EFGH.getName() + "): " + EFGH.findArea() + "\n";
      res += "Diagonal difference (" + ABCD.getName() + "): " + ABCD.diagonalDifference() + "\n";
      res += "Diagonal difference (" + EFGH.getName() + "): " + EFGH.diagonalDifference() + "\n";
      res += "couldBeIsosceles (" + ABCD.getName() + "): " + ABCD.couldBeIsosceles() + "\n";
      res += "couldBeIsosceles (" + EFGH.getName() + "): " + EFGH.couldBeIsosceles() + "\n";
      res += "isBigger (" + EFGH.getName() + " is bigger than" + ABCD.getName() + "): " + EFGH.isBigger(ABCD);
      
      System.out.println(res);
   }
}