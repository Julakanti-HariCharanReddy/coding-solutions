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
		    int p[] = new int[n];
		    
		    int sum = 0;
		    for(int m = 0;m<n;m++){
		        p[m]=sc.nextInt();
		       // r = Math.min(r,p[m]);
		       sum+=p[m];
		    }
		     int r = p[0];
            for(int m = 1; m < n; m++){
                r = Math.min(r, p[m]);
            }
            
             System.out.println(sum - r);
		    
		}
		}

	}
