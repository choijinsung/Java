import java.util.*;

public class Annuity
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter pmt: ");
		int pmt = stdin.nextInt();
		System.out.print("Enter n: ");
		int n = stdin.nextInt();
		System.out.print("Enter i: ");
		double i = stdin.nextDouble();

		double pv = pmt * ((Math.pow(1+i, n-1) - 1) / i / (Math.pow(1+i, n-1) + 1));

		System.out.println("The present value is " + pv);
	}
}