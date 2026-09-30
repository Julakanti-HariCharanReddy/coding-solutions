import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int a[] = new int[m];
		    for(int i = 0; i<m;i++){
		        a[i] = sc.nextInt();
		    }
		    int d = 0 , count = 0;
		    for(int seat = 1 ; seat<=n&&count < k;seat++){
		        if (d< m && seat == a[d]) {
                    d++;
                } else {
                    System.out.print(seat + " ");
                    count++;
                }
		    }
		    System.out.println();
		}

	}
}
