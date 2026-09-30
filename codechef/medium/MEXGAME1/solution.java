import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] count = new int[105];
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                count[a[i]]++;
            }
            int mex = 0;
            while (count[mex] > 0) {
                mex++;
            }
            
            int moves = 0;
           
    for (int x : a) {
                if (x > mex) {
                    moves += (x - mex - 1);
                }
            }
            
            for (int i = 0; i < mex; i++){
                if (count[i] > 1) {
                    moves += (long) (count[i] - 1) * i;
                }
            }
            System.out.println(moves % 2 != 0 ? "Alice" : "Bob");
        }
        sc.close();
    }
}
