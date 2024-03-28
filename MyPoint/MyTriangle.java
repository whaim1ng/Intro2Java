//********************************************************************
//  MyTriangle.java       Author: Max Wang
//
//  models a triangle with 3 vertices, which are three instances of MyPoint.
//********************************************************************
import java.util.*;

public class MyTriangle {
   // private variables
   private String name;
   private MyPoint V1;
   private MyPoint V2;
   private MyPoint V3;
   
   // constructor 
   public MyTriangle(MyPoint a, MyPoint b, MyPoint c, String n) {
      name = n;
      V1 = a;
      V2 = b;
      V3 = c; 
   }
   
   // set points individually
   public void setV1(MyPoint p) { V1 = p; }
   public void setV2(MyPoint p) { V2 = p; }
   public void setV3(MyPoint p) { V3 = p; }
   
   // returns the points
   public MyPoint getV1() { return V1; }
   public MyPoint getV2() { return V2; }
   public MyPoint getV3() { return V3; }
   
   // to string
   public String toString() {
      return "Triangle " + name + ": " + V1 + ", " + V2 + ", " + V3;
   }
   
   // find the perimeter
   public double findPerimeter() { return V1.findDistance(V2) + V1.findDistance(V3) + V2.findDistance(V3); }
   
   // finds the area using herons formula
   public double findArea() {
      double a = V1.findDistance(V2), b = V1.findDistance(V3), c = V2.findDistance(V3), s = findPerimeter()/2;
      
      return Math.sqrt(s*(s - a)*(s - b)*(s - c));
   }
   
   // finds display type
   public String displayType() {
      String type = "";
      // makes variable for each side
      double a = V1.findDistance(V2), b = V1.findDistance(V3), c = V2.findDistance(V3), s = findPerimeter()/2;
      
      // type of triange
      if (a >= b && a >= c) {
         // if a is the hypotenuse
         if (b*b + c*c == a*a) {
            type = "Right";
         } else if ( b*b + c*c >= a*a) {
            type = "Acute";
         } else {
            type = "Obtuse";
         }
      } else if (b >= a && b >= c) {
         // if b is the hypotenuse
         if (a*a + c*c == b*b) {
            type = "Right";
         } else if (a*a + c*c >= b*b) {
            type = "Acute";
         } else {
            type = "Obtuse";
         }
      } else {
         // if c is the hypotenuse
         if (b*b + a*a == c*c) {
            type = "Right";
         } else if (b*b + a*a >= c*c) {
            type = "Acute";
         } else {
            type = "Obtuse";
         }
      }
      
      // shape of triangle
      if ( a == b && a == c && c == b) {
         type += " Equilateral";
      } else if ( a == b || a == c || c == b) {
         type += " Isosceles";
      } else {
         type += " Scalene";
      }
      
      return type;
   }
}