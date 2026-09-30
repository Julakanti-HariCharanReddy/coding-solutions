import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-->0){
		    int p = sc.nextInt();
		    int z = sc.nextInt();
		    int g = p*z;
		    if(g%2==0){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}
