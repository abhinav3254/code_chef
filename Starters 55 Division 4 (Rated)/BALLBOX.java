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
		
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		for (int i = 0;i<test;i++) {
		    long ball = sc.nextInt();
		    long box = sc.nextInt();
		    
		    long res = (box*(box+1))/2;
		    
		    if (res<=ball) {
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		}
	}
}
