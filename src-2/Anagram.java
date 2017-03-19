import java.util.HashMap;

public class Anagram {
	
	public boolean checkAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else
		{
			HashMap<Character,Integer> validator = new HashMap<Character,Integer>();
			
			for(int i=0;i<s1.length();i++)
			{
				if(validator.containsKey(s1.charAt(i)))
				{
					int value = validator.get(s1.charAt(i));
					value++;
					validator.put(s1.charAt(i), value);
				}
				else
				{
					validator.put(s1.charAt(i), 1);
				}
			}
			
			for(int i=0;i<s2.length();i++)
			{
				if(validator.containsKey(s2.charAt(i)))
				{
					int value = validator.get(s2.charAt(i));
					value--;
					if(value==0)
					{
						validator.remove(s2.charAt(i));
					}
				}
			}
			
			if(validator.isEmpty())
			{
				return true;
			}
			else
			{
				return false;
			}
		}		
	}	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1 = new String();
		String s2 = new String();
		s1="cinema";
		s2="iceman";
		Anagram sample = new Anagram();
		boolean result = sample.checkAnagram(s1, s2);
		if (result)
		{
			System.out.println("they are confused bachas");
		}
		else
		{
			System.out.println("they are NOT totally different bachas");
		}
	}

}
