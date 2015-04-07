import java.util.Random;

public class FinderTest {
	public static void main(String[] args)
	{
		Finder f = new Finder("abcdefg");
		String origin = "";
		
		String smallChar = "abcdefghijklmnopqrstuvwxyz";
		
		Random generator = new Random();
		int charNum = generator.nextInt(7)+1;
		
		for(int i=0; i<charNum; i++)
		{
			int arrayNum = generator.nextInt(26);
			origin += smallChar.charAt(arrayNum);
		}
	
		int result = f.findFirst(origin);
		System.out.println("substring is " + origin);
		System.out.println("result is " + result);
	}
}

class Finder {
	private String s;
	public Finder(String aString)
	{
		s = aString;
	}
	public int findFirst(String sub)
	{
		int i=0;
		
		while(sub.length()+i <= s.length())
		{
			if(s.substring(i, i+sub.length()).equals(sub))
				return i;
			else 
				i++;
		}
		
		return -1;
	}
}