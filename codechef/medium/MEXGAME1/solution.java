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
		    int p = sc.nextInt();
		    int n[] = new int[p];
		    int count[] = new int[100];
		    for(int i = 0;i<p;i++){
		        n[i] = sc.nextInt();
		        count[n[i]]++;
		        
		    }
		    int mex = 0;
		    while(count[mex]>0) mex++;;
		    long moves = 0;
		     for (int i = 0; i < 105; i++) {
                if (i < mex && count[i] > 1) moves += (long) (count[i] - 1) * i;
                if (i > mex) moves += (long) count[i] * (i - mex);
            }
            
            System.out.println(moves % 2 != 0 ? "Alice" : "Bob");
		    
		    
		}

	}
}
