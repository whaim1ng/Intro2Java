//********************************************************************
//  classwork15.java       Author: Max Wang
//
//  java is so fun!!!!
//********************************************************************
import java.util.*;

public class classwork15b {
   
   // accpets two integers and returns the sum of all integers between them, including i and j
   // i <= j
   public static int sumOfValues(int i, int j) {
      int ans = 0;
      
      // for loop for the task
      for (; i <= j; i++) {
         ans += i;
      }   
      
      return ans;
   }
   
   // accepts an integer and returns true if the iteger is prime and false if its not
   public static boolean isPrime(int n) {
      int mod;
      
      if (n == 1) {
         // 1 is not prime
         return false;
      }
      for (int i = 2; i < n; i++) {
         mod = n % i;
         
         if (mod == 0) {
            return false;
         }
      }
      return true;
   }
   
   public static boolean isSemiPrime(int n) {
      int mod;
      int prime2;
      
      if (isPrime(n)) {
         return false;
      }
      for (int i = 2; i < n; i++) {
         mod = n % i;         
         if (isPrime(i) && mod == 0) {
               prime2 = n/i;
               
               if (isPrime(prime2)) {
                  return true;
               }
         }
         
      }
      return false;
   }
   
   public static boolean isTwinPrime(int n) { 
      if (isPrime(n) == false) {
         return false;
      }
      
      if (isPrime(n + 2) == true || isPrime(n - 2) == true) {
         return true;
      }
      
      return false;
   }
   
   public static boolean isChenPrime(int n) {
      if (isSemiPrime(n) == true || isTwinPrime(n) == true || isPrime(n)) {
         return true;
      }
      return false;
   }
   
   public static boolean isCousinPrime(int n) { 
      if (isPrime(n) == false) {
         return false;
      }
      
      if (isPrime(n + 4) == true || isPrime(n - 4) == true) {
         return true;
      }
      
      return false;
   }
   
   public static boolean isTripletPrime(int n) { 
      if (isPrime(n) == false) {
         return false;
      }
      
      if (isPrime(n + 4) == true && isPrime(n + 6) == true) {
         return true;
      }
      
      if (isPrime(n + 2) == true && isPrime(n + 6) == true) {
         return true;
      }
      
      return false;
   }
   
   public static boolean isQuadrupletPrime(int n) {
      if (isPrime(n) && isPrime(n + 2) && isPrime(n + 6) && isPrime(n + 8)) {
         return true;
      } else if (isPrime(n - 2) && isPrime(n) && isPrime(n + 4) && isPrime(n + 6)) {
         return true;
      } else if (isPrime(n - 2) && isPrime(n - 4) && isPrime(n) && isPrime(n + 2)) {
         return true;
      } else if (isPrime(n - 8) && isPrime(n - 6) && isPrime(n - 2) && isPrime(n)) {
         return true;
      }
      return false;
   }
   
   public static boolean isSexyPrime(int n) {
      if (isPrime(n) && isPrime(n + 6)) {
         return true;
      } else if (isPrime(n - 6) && isPrime(n)) {
         return true;
      }
      return false;
   }
   
   
   // keep working on this
   public static boolean isInterPrime(int n) {
      int mod;
      int factor1 = 0, factor2 = 0;
      
      if (isSemiPrime(n)) {
         for (int i = 2; i < n; i++) {
            mod = n % i;         
            if (isPrime(i) && mod == 0) {
               factor1 = i;
               factor2 = n/i;
            }
            if ((factor1 + factor2)/2 == n) {
               return true;
            }
         }
      }   
      
      return false; 
   }
   
   public static boolean isSophieGermainPrime(int n) {
      if (isPrime(n) && (isPrime(2 * n + 1))) {
         return true;
      }
      return false;
   }
   
   public static boolean isSafePrime(int n) {
      if (isPrime(n) && isPrime((n-1)/2)) {
         return true;
      }
      return false;
   }
   
   public static void factorization(int n) {
      int num = n;
      int factor = 2;
      
      while (n == factor) {
         if (isPrime(factor) && num % factor == 0) {
            System.out.print(factor +  " ");
            num = num / factor;
         }
      }  
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int i, j, n;
   
//       // task one
//       System.out.println("enter the numbers you want to find the sum of inbetween or something");
//       i = sc.nextInt();
//       j = sc.nextInt();
//       System.out.println("the sum of your values inclusive and stuff is " + sumOfValues(i, j));
//       
//       // task two
//       // prime
//       System.out.println("enter the value to find whether or not its prime");
//       n = sc.nextInt();
//       boolean isPrime = isPrime(n);
//       
//       if (isPrime == false) {
//          System.out.println(n + " is not prime");
//       } else if (isPrime == true) {
//          System.out.println(n + " is prime");
//       }
//       
//       // task three
//       // semi prime
//       System.out.println("enter the value to find whether or not its semiprime");
//       n = sc.nextInt();
//       boolean isSemiPrime = isSemiPrime(n);
//       
//       if (isSemiPrime == false) {
//          System.out.println(n + " is not semiprime");
//       } else if (isSemiPrime == true) {
//          System.out.println(n + " is semiprime");
//       }
//       
//       // task four
//       // twin prime
//       System.out.println("enter the value to find whether or not its twin prime");
//       n = sc.nextInt();
//       boolean isTwinPrime = isTwinPrime(n);
//       
//       if (isTwinPrime == false) {
//          System.out.println(n + " is not twinprime");
//       } else if (isTwinPrime == true) {
//          System.out.println(n + " is twinprime");
//       }
//          
//       // task five
//       // chen prime
//       System.out.println("enter the value to find whether or not its chen prime");
//       n = sc.nextInt();
//       boolean isChenPrime = isChenPrime(n);
//       
//       if (isChenPrime == false) {
//          System.out.println(n + " is not chenprime");
//       } else if (isChenPrime == true) {
//          System.out.println(n + " is chenprime");
//       }
//       
//       // task six
//       // cousin prime
//       System.out.println("enter the value to find whether or not its cousin prime");
//       n = sc.nextInt();
//       boolean isCousinPrime = isCousinPrime(n);
//       
//       if (isCousinPrime == false) {
//          System.out.println(n + " is not cousinprime");
//       } else if (isCousinPrime == true) {
//          System.out.println(n + " is cousin prime");
//       }      
//       
//       // task seven
//       // triplet prime
//       System.out.println("enter the value to find whether or not its triplet prime");
//       n = sc.nextInt();
//       boolean isTripletPrime = isTripletPrime(n);
//       
//       if (isTripletPrime == false) {
//          System.out.println(n + " is not triplet prime");
//       } else if (isTripletPrime == true) {
//          System.out.println(n + " is triplet prime");
//       }
//       
//       // task eight
//       // quadruplet prime
//       System.out.println("enter the value to find whether or not its quad prime");
//       n = sc.nextInt();
//       boolean isQuadrupletPrime = isQuadrupletPrime(n);
//       
//       if (isQuadrupletPrime == false) {
//          System.out.println(n + " is not Quadruplet Prime");
//       } else if (isQuadrupletPrime == true) {
//          System.out.println(n + " is Quadruplet Prime");
//       }
//       
//       // task nine
//       // sexy prime
//       System.out.println("enter the value to find whether or not its sexy prime");
//       n = sc.nextInt();
//       boolean isSexyPrime = isSexyPrime(n);
//       
//       if (isSexyPrime == false) {
//          System.out.println(n + " is not SexyPrime");
//       } else if (isSexyPrime) {
//          System.out.println(n + " is SexyPrime");
//       }
//       
//       // task ten
//       // interprime
//       System.out.println("enter the value to find whether or not its interprime");
//       n = sc.nextInt();
//       boolean isInterPrime = isInterPrime(n);
//       
//       if (isInterPrime == false) {
//          System.out.println(n + " is not isInterPrime");
//       } else if (isInterPrime) {
//          System.out.println(n + " is isInterPrime");
//       }
//       
//       // task eleven
//       // sophie germain prime
//       System.out.println("enter the value to find whether or not its isSophieGermainPrime");
//       n = sc.nextInt();
//       boolean isSophieGermainPrime = isSophieGermainPrime(n);
//       
//       if (isSophieGermainPrime == false) {
//          System.out.println(n + " is not isSophieGermainPrime");
//       } else if (isSophieGermainPrime) {
//          System.out.println(n + " is SophieGermainPrime");
//       }
//       
//       // task twelve
//       // safe prime
//       System.out.println("enter the value to find whether or not its isSophieGermainPrime");
//       n = sc.nextInt();
//       boolean isSafePrime = isSafePrime(n);
//       
//       if (isSafePrime == false) {
//          System.out.println(n + " is not safe Prime");
//       } else if (isSafePrime) {
//          System.out.println(n + " isSafePrime");
//       }
      
      // take thirteen
      // prime factorization
      System.out.println("enter the value that you wanna factorize");
      n = sc.nextInt();
      System.out.print("the factors of " + n + " are: ");
      factorization(n);
   }
}