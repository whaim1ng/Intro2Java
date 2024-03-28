import java.util.*;

public class classwork26question2 { 
   public static void main(String[] args) { 
         int N = 3;
         double ans = 0;
        
         int[] a = {2, 1, 3};
         int[] b = {7, -1, 0};
        
         for (int i = 0; i < 3; i++){
            ans = (double)(ans + (a[i] - b[i]) * (a[i] - b[i]));
         }
         ans = Math.sqrt(ans);
         
         System.out.println(ans);
    }
}
