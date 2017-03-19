import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AppleAndOrange
{
	 public static void main(String[] args)
	 {
		 Scanner in = new Scanner(System.in);
		 int s = in.nextInt();
		 int t = in.nextInt();
		 int a = in.nextInt();
		 int b = in.nextInt();
		 int m = in.nextInt();
		 int n = in.nextInt();
		 int appleDistance,OrangeDistance,appleCount=0,orangCount=0;
		 for(int apple_i=0; apple_i < m; apple_i++)
		    {
		    	appleDistance = in.nextInt();
		    	if(appleDistance<0)
		    	{
		    		continue;
		    	}
		    	else
		    	{
		    		if(a+appleDistance >= s && a+appleDistance <= t)
		    		{
		    			appleCount++;
		    		}
		    	}
		    	
		    }
		    for(int orange_i=0; orange_i < n; orange_i++)
		    {
		    	OrangeDistance = in.nextInt();
		    	if(OrangeDistance>0)
		    	{
		    		continue;
		    	}
		    	else
		    	{
		    		if(b+OrangeDistance >= s && b+OrangeDistance <= t)
		    		{
		    			orangCount++;
		    		}
		    	}
		    }
		    in.close();
		    System.out.println(appleCount);
		    System.out.println(orangCount);
	 }	 		
		    
}
