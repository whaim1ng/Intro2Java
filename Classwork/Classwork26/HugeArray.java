public class HugeArray { 

    public static void main(String[] args) { 
        int N = 1000;
        int[] a = new int[N*N*N*N];
        System.out.println(a.length);
    }
}
// 2. there was a size exception; the array is too big