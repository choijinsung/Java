import java.*;

public class BrownFox
{
	public static void main(String[] args)
	{
		String inputString = "The quick brown fox jumps over the lazy dog";
		
		String s0 = "";
		String s1 = s0.concat(inputString.substring(0,1));
		
		String s2 = s1.concat(inputString.substring(2,3));
		
		String s3 = s2.concat(inputString.substring(22,23));
		
		String s4 = s3.concat(inputString.substring(23,24));

		String s5 = s4.concat(inputString.substring(5,6));
		
		String s6 = s5.concat(inputString.substring(24,25));

		String s7 = s6.concat(inputString.substring(3,4));
		
		String s8 = s7.concat(inputString.substring(16,17));
		
		String s9 = s8.concat(inputString.substring(5,6));
		
		String s10 = s9.concat(inputString.substring(42,43));
		
		String s11 = s10.concat(inputString.substring(6,7));

		String outputString = s11.concat(inputString.substring(31,32));
	
		System.out.println(outputString);
	}
}