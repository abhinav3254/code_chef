/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0;i<t;i++){
		    int temp = Integer.parseInt(br.readLine());
		    
		    if (temp > 98) {
		        System.out.println("YES");
		    } else {
		    System.out.println("NO");
		    }
		}
	}
}
