import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		while (T--) {
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K <= N) {
            System.out.printf("0\n");
        } else {
            System.out.printf("%d\n", 2 * (K - N));
        }
    }

}
	
}
