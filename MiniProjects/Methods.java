//********************************************************************
//  miniProjectMethods.java       Author: Max Wang
//
//  java is so fun!!!!
//********************************************************************
import java.util.*;


public class Methods {
   // factorial
   public static int factorial(int n) {
      int ans = 1;
      
      // multiplies 1 by i until i reaches n where i = i + 1 after every iteration
      for (int i = 1; i <=n; i++) {
         ans = ans * i;
      }
      
      // returns the answer after i reaches n
      return ans;
   }
   
   // sumOfDigits
   public static int sumOfDigits(int n) {
      // stores the input into a string
      String input = String.valueOf(n);
      int digit, ans = 0;
      
      // makes ans = sum of all the digits through a loop and charAt()
      for (int i = 0; i < input.length(); i++) {
         digit = input.charAt(i);
         ans = ans + Character.getNumericValue(digit);
      }
      
      // returns the answer
      return ans;
   }
   
   // isPerfect
   public static boolean isPerfect(int n) {
      int sumOfFactors = 0;
      
      // repeats loop until i is equal to n/2 (a factor of a number can be at most half of that number)
      for (int i = 1; i <= n/2; i++) {
         // if i is a factor, then add it to the sum
         if (n % i == 0) {
            sumOfFactors = sumOfFactors + i;
         }
         // when the sum of factorials is equal to the number, return true
         if (sumOfFactors == n) {
            return true;
         }
      }
      
      // else, return false
      return false;
   }
   
   // averageDigits
   public static double averageDigit(int n) {
      // converts n(or the input) into a string
      String input = String.valueOf(n);
      // finds how many digits are in n
      int nLength = input.length();
      
      // returns the average of the digits: the sum of all digits dived by the length of the input
      return sumOfDigits(n)/nLength;
   }
   
   // average function for hasMidpoint()
   public static int average(int a, int b) {
      return (a+b)/2;
   }
   
   // hasMidPoint
   public static boolean hasMidpoint(int a, int b, int c) {
      // if any of the combinations of averages is an average, return true
      if (a == b && b == c) {
         return true;
      } else if (average(a, b) == c || average(a, c) == b || average(b, c) == a) {
         return true;
      }
      return false;
   }
   
   // nPr
   public static int nPr(int n,  int r) {
      return factorial(n) / factorial(n - r);
   }
   
   // nCr
   public static int nCr(int n, int r) {
      return nPr(n, r) / factorial(r);
   }
   
   // doubleFactorial
   public static double doubleFactorial(int n) {
      return factorial(factorial(n));
   }
   
   // prime 
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
   
   // primorial
   public static double primorial(int n) {
      int ans = 1;
      
      for (int i = 1, j = 1; j <= n;) {
         if (isPrime(i)) {
            ans = ans * i;
            j++;
         }
         i++;
      }
      
      return ans;
   }
   
   // compositorial
   public static double compositorial(int n) {
      int ans = 1;
      
      for (int i = 1; i <= n; i++) {
         if (isPrime(i) == false) {
            ans = ans * i;
         }
      }
      
      return ans;
   }
   
   // superfactorial
   public static double superFactorial(int n) {
      int ans = 1;
      
      for (int i = 1; i <= n; i++) {
         ans = ans * factorial(n);
      }
      
      return ans;
   }
   
   // alternatingFactorial
   public static double alternatingFactorial(int n) {
      int ans = 0;
      
      for (int i = 1; i <= n; i++) {
         if (i % 2 == 0) {
            ans = ans + factorial(i);
         } else {
            ans = ans - factorial(i);
         }
      }
      
      return ans;      
   }
   
   public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in);
         
         int choice, n = 0, a = 0, b = 0, c = 0, r = 0;
         
         
         System.out.println("What function do you want to use: \n1. factorial \n2. sumOfDigits \n3. isPerfect \n4. averageDigits\n5. hasMidPoint\n6. Permutation\n7. Combination\n8. Double Factorial\n9. primorial\n10. compositorial\n11. superfactorial\n12. alternatingFactorial");
         choice = sc.nextInt();
         
         // if there are 3 variables needed
         if (choice == 5) {
            System.out.print("First number being used: ");
            a = sc.nextInt();
            System.out.print("Second number being used: ");
            b = sc.nextInt();
            System.out.print("Third number being used: ");
            c = sc.nextInt();
         } else if (choice <= 5 || choice >= 8) {
            // if there is only one variable needed
            System.out.print("Number being used: ");
            n = sc.nextInt();
         } else if (choice == 6 || choice == 7) {
            // if there are two variables needed(nCr and nPr)
            System.out.print("Total number of things: ");
            n = sc.nextInt();
            System.out.print("number of things being rearraged: ");
            r = sc.nextInt();
         }
         
         // if choice = x in case x, then print the function selected
         switch (choice) {
            case 1:
               // factorial
               System.out.println(factorial(n));
               
            break;
               
            case 2:
               // sumOfDigits
               System.out.println(sumOfDigits(n));
            
            break;
            
            case 3:
               // isPerfect
               System.out.println(isPerfect(n));
            break;
            
            case 4:
               // averageDigit
               System.out.println(averageDigit(n));
            
            break;
            
            case 5:
               // midPoint
               System.out.println(hasMidpoint(a, b, c));
            break;
            
            case 6:
               // permutation
               System.out.println(nPr(n, r));
            break;
            
            case 7:
               // combination 
               System.out.println(nCr(n, r));
            break;
            
            case 8:
               //double factorial
               System.out.println(doubleFactorial(n));
            break;
            
            case 9:
               // primorial 
               System.out.println(primorial(n));
            break;
            
            case 10:
               // compositorial
               System.out.println(compositorial(n));
            break;
            
            case 11:
               // superFactorial
               System.out.println(superFactorial(n));            
            break;
            
            case 12:
               // alternatingFactorial
               System.out.println(alternatingFactorial(n));
            break;
         }
         
   }
}