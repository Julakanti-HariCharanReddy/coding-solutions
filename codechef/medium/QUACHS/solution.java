import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scaner(System.in);
		int a[];
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0;i < n ;i++ ){
		    a[i] = sc.nextInt();
		} 
		for (int i = 0;i < n-1 ;i++ ){
		    sum = sum  + a[i];
		} 
		int mul = 2*a[2];
		int sub = sum - mul;
		System.out.print(sub);

	}
}
