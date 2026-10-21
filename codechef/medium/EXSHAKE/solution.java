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
		    
		    int a[] = new int[n];
		    
		    for(int i = 0 ; i<n;i++){
		        a[i] = sc.nextInt();
		    }
		    Arrays.sort(a);
		    int p = 0, c =0;
		    
		    for(int x : a){
		        int next = p +x;
		        
		        if((next*(next-1)/2)<=m){
		            p = next;
		            c++;
		        }else{
		            break;
		        }
		    }
		    
		    System.out.println(c);
		    
		}

	}
}
