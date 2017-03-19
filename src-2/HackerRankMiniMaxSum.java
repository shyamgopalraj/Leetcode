import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
	
public class HackerRankMiniMaxSum
{

	    public static void main(String[] args) 
	    {
	        Scanner in = new Scanner(System.in);
	        long a = in.nextLong();
	        long b = in.nextLong();
	        long c = in.nextLong();
	        long d = in.nextLong();
	        long e = in.nextLong();
	        in.close();
	        long[] store = new long[5];
	        store[0] = a;
	        store[1] = b;
	        store[2] = c;
	        store[3] = d;
	        store[4] = e;
	        Arrays.sort(store);
	        long sum=0,min=0,max=0;
	        
	        for(int i=0;i<5;i++)
	        {
	        	sum = sum+store[i];
	        }
	        
	        min = sum-store[4];
	        max = sum-store[0];
	        System.out.println(min+" "+max);
	    }
}

