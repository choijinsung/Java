import java.util.*;

public class BaseConvert
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = stdin.nextInt();

		System.out.print("Enter a base: ");
		int b = stdin.nextInt();	

		int maxNumber = b*b*b*b-1;
		
		System.out.println("The maxnumber is " + maxNumber);	

		int place0 = n % b;
		int baseNum1 = n / b;
	
		int place1 = baseNum1 % b;
		int baseNum2 = baseNum1 / b;

		int place2 = baseNum2 % b;
		int baseNum3 = baseNum2 / b;

		int place3 = baseNum3 % b;

		String baseBNum = "";
	
		System.out.println("baseBNum is " + baseBNum + place3 + place2 + place1 + place0);		
	}
}