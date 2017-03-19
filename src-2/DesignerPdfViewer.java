import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPdfViewer
{
	 public static void main(String[] args) 
	    {
	        Scanner in = new Scanner(System.in);
	        int n = 26;
	        int h[] = new int[n];
	        for(int h_i=0; h_i < n; h_i++)
	        {
	            h[h_i] = in.nextInt();
	        }
	        String word = in.next();
	        in.close();
	        int value,max=0;
	        for (int i=0;i<word.length();i++)
	        {
	        	char a = word.charAt(i);
	        	value = a-'a';
//	        	System.out.println(value);
	        	if(i==0)
	        	{
	        		max = h[value];
	        	}
	        	else
	        	{
	        		if(h[value]>max)
	        		{
	        			max=h[value];
	        		}
	        	}
	        }
	        int area = max*word.length();
	        System.out.println(area);
	    }
}
