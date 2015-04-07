import java.util.Random;

public class FinderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finder f = new Finder("abcdefghijklmn");
		String origin = "";
		
		String smallChar = "abcdefghijklmnopqrstuvwxyz";
		
		Random generator = new Random();
		int charNum = generator.nextInt(14)+1;
		
		for(int i=0; i<charNum; i++)
		{
			int arrayNum = generator.nextInt(26);
			origin += smallChar.charAt(arrayNum);
		}
	
		int result = f.findLast(origin);
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
	public int findLast(String sub)
	{
		String sCopy = s;
		
		while(sub.length() <= sCopy.length())
		{
			if(sCopy.substring(sCopy.length()-sub.length(), sCopy.length()).equals(sub))
				return sCopy.length()-sub.length();
			else
				sCopy = sCopy.substring(0, sCopy.length()-2);
		}
		
		return -1;
	}
}