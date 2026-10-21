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
	    int s = sc.nextInt();
	    
	    int p = (s+3)/4;
	    
	    int a = -1;
	    
	    for(int i = p;i<=n;i++){
	        int w = 4*i -s;
	        if(i+w<=n){
	            a = w+i;
	            break;
	        }
	        
	    }
	    
	    System.out.println(a);
	}
	}
}
