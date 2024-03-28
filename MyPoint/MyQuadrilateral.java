//********************************************************************
//  MyQuadrilateral.java       Author: Max Wang
//
//  models a quadrilateral with 4 vertices, which are four instances of MyPoint.
//********************************************************************
import java.util.*;

public class MyQuadrilateral {
   // instance varialbes
   private String name;
   private MyPoint V1;
   private MyPoint V2;
   private MyPoint V3;
   private MyPoint V4;
   
   // constructor function
   public MyQuadrilateral(MyPoint a, MyPoint b, MyPoint c, MyPoint d, String n) {
      name = n;
      V1 = a;
      V2 = b;
      V3 = c; 
      V4 = d;
   }
   
   // set
   public void setV1(MyPoint p) { V1 = p; }
   public void setV2(MyPoint p) { V2 = p; }
   public void setV3(MyPoint p) { V3 = p; }
   public void setV4(MyPoint p) { V4 = p; }
   
   // get
   public String getName() { return name; } // returns the quadrilateral name for later use in the driver
   public MyPoint getV1() { return V1; }
   public MyPoint getV2() { return V2; }
   public MyPoint getV3() { return V3; }
   public MyPoint getV4() { return V4; }
   
   // toString: prints "Quadrilateral name: points"
   public String toString() { return "Quadrilateral " + name + ": " + V1 + ", " + V2 + ", " + V3 + ", " + V4; }
   
   // find perimeter of the quadrilateral
   public double findPerimeter() { return V1.findDistance(V2) + V1.findDistance(V4) + V2.findDistance(V3) + V3.findDistance(V4); }
   
   // finds area of the quadrilateral
   public double findArea() {
      MyTriangle x = new MyTriangle(V1, V3, V4, "x");
      MyTriangle y = new MyTriangle(V1, V3, V2, "x");
      // adds two traingles made by a diagnol of the quadrilateral
      return x.findArea() + y.findArea();
   }
   
   // prints the diag difference of the quadrilateral
   public double diagonalDifference() { return Math.abs(V4.findDistance(V2) - V1.findDistance(V3)); }
   
   // prints true if the quadrilateral could be isosceles(if the difference in the diagonal is 0, then it could be isosceles)
   public boolean couldBeIsosceles() {
      if (diagonalDifference() == 0) {
         return true;
      } else {
         return false;
      }
   }
   
   // returns true if the first quadrilateral bigger than sencond
   public boolean isBigger(MyQuadrilateral other) {
      if (findArea() > other.findArea()) {
         return true;
      } else {
         return false;
      }
   }
}