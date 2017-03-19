import java.util.*;

public class Fat 
{
	
	private float mass;
	
	public Fat()
	{
		//default mass
		mass = 100;		
	}
	
	public Fat(float uservalue)
	{
		if (uservalue <= 0)
		{
			System.out.println("Invalid value");
			mass = 100;
		}
		else
			mass = uservalue;			
	}
	
	public float getmass()
	{
		return mass;
	}
	
	public float GetWeightOnEarth()
	{
		return (float)(mass*9.8);
	}
	
	public float GetWeightOnMoon()
	{
		return (float)(mass*1.62);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fat fatso = new Fat(0);
		if (fatso.getmass()==100){
			System.out.println(" Considering default mass - 100");	
		}
		System.out.printf("user weight on Earth is %.2f",fatso.GetWeightOnEarth());	
		System.out.println();
		System.out.printf("user weight on Moon is %.2f",fatso.GetWeightOnMoon());
		
		String[] words = {"a","ba", "bca", "bdca", "bda", "b"};
		
	    Arrays.sort(words, new Comparator<String>() {
	        public int compare(String str1, String str2) {
	            return str2.length()-str1.length();
	        }
	    });
	    
	    for(String word: words){
	    	System.out.println(word);
	    }
	}

}

