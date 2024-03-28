//********************************************************************
//  MyTriangleDriver.java       Author: Max Wang
//
//  driver for myPoint
//********************************************************************
import java.util.*;

public class MyTriangleDriver {
   public static void main(String[] args) {
      Random rand = new Random();
      // intializes result string
      String res = "";
      
      // point 1
      int x1 = rand.nextInt(-10, 10), y1 = rand.nextInt(-10, 10);
      MyPoint point1 = new MyPoint(x1, y1);
      
      // point 2
      int x2 = rand.nextInt(-10, 10), y2 = rand.nextInt(-10, 10);
      MyPoint point2 = new MyPoint(x2, y2);
      
      // point 3
      int x3 = rand.nextInt(-10, 10), y3 = rand.nextInt(-10, 10);
      MyPoint point3 = new MyPoint(x3, y3);
      
      // triangle
      MyTriangle ABC = new MyTriangle(point1, point2, point3, "ABC");
      
      // if triangle has no area it cannot be a triangle
      if (ABC.findArea() == 0) {
         System.out.println("The points don't form a triangle");
         System.exit(0);
      }
      
      res += "Triangle ABC: " + ABC.toString() + "\n";
      res += "Perimeter: " + ABC.findPerimeter() + "\n";
      res += "Area: " + ABC.findArea() + "\n";
      res += "Type: " + ABC.displayType();
      
      System.out.println(res);
   }
}