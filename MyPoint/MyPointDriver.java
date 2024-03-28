//********************************************************************
//  MyPointDriver.java       Author: Max Wang
//
//  driver for myPoint
//********************************************************************
import java.util.*;

public class MyPointDriver {
   public static void main(String[] args) {
      // point 1
      int x1 = 3, y1 = 2;
      MyPoint point1 = new MyPoint(x1, y1);
      
      // point 2
      int x2 = 7, y2 = -1;
      MyPoint point2 = new MyPoint(x2, y2);
      
      // print statements      
      System.out.println("Point 1 = " + point1.getPoint());
      System.out.println("Point 2 = " + point2.getPoint());
      System.out.println("Distance = " + point1.findDistance(point2));
      System.out.println("Distance using the other method call = " + point1.findDistance(point2.getX(), point2.getY()));
      
      // if the slop is undefined or infinite or Not a Number, then print undefined
      if (Double.compare(point1.findSlope(point2), Double.NaN) == 0) {
         System.out.println("Slope = Undefined");
         System.out.println("Slope using the other method call = Undefined");
      } else {
         System.out.println("Slope = " + point1.findSlope(point2));
         System.out.println("Slope using the other method call = " + point1.findSlope(point2.getX(), point2.getY()));
      }
   }
}