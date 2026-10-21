import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
			int b = sc.nextInt();
			int c;
			if(a>b)
			 c = a - b - 1;
			else 
			c = b - a -1;
			System.out.println(c);


	}
}
