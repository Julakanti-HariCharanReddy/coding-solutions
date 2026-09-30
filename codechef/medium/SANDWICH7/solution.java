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
		int p = sc.nextInt();
		int z = sc.nextInt();
		
	int b = n/2;
	int c = p+z;
	
	int r = Math.min(b,c);
	
	System.out.print(r);
		

	}
}
