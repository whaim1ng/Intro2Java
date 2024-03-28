//********************************************************************
//  MyPoint.java       Author: Max Wang
//
//  models a 2D point with x and y coordinates
//********************************************************************
import java.util.*;

public class MyPoint {
   private int xCoordinate;
   private int yCoordinate;
   
   // default constructor
   public MyPoint() {
      xCoordinate = 0;
      yCoordinate = 0;
   }
   
   // constructor
   public MyPoint(int x, int y) {
      xCoordinate = x;
      yCoordinate = y;
   }
   
   // get
   public int getX() { return xCoordinate; }
   public int getY() { return yCoordinate; }
   public String getPoint() { return "(" + xCoordinate + ", " + yCoordinate + ")"; }
   
   // set
   public void setXY(int x, int y) { xCoordinate = x; yCoordinate = y; }
   
   // to string(returns the point coordinates)
   public String toString() {
      return "(" + xCoordinate + ", " + yCoordinate + ")";
   }
   
   // finds the distance between two points
   public double findDistance(int x, int y) {
      return Math.sqrt((xCoordinate - x)*(xCoordinate - x) + (yCoordinate - y)*(yCoordinate - y));
   }
   public double findDistance(MyPoint p) {
      return findDistance(p.getX(), p.getY());
   }
   
   // finds the slope between two points
   public double findSlope(int x, int y) { return (double)(yCoordinate - y)/(xCoordinate - x); }
   public double findSlope(MyPoint p){
      return findSlope(p.getX(), p.getY());
   }
}