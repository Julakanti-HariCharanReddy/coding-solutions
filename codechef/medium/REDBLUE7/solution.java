import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int j= sc.nextInt();
		while(j-->0){
		      int n = sc.nextInt();
            long[] a = new long[n];
           long []p = new long[n + 1];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
            }

            Arrays.sort(a);

            for (int i = 0; i < n; i++)
                p[i + 1] = p[i] + a[i];

            long ans = 0;

            for (int r = 1; r < n; r++) {
                long sr = (r <= n / 2) ? sum - p[n]- r : p[r];            
                long val = sr * (n - r) + (sum - sr) * r;
                ans = Math.max(ans, val);
            }

            System.out.println(ans);
		}

	}
}
