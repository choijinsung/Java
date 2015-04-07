public class Numeric {
	public static double power(double a, int n)
	{
		double r = 1;
		double b = a;
		int i = n;
		
		while(i>0)
		{
			if(i%2 == 0)
			{
				b=b*b;
				i=i/2;
			}
			else
			{
				r=r*b;
				i--;
			}
		}
		return r;
	}
	public static double cal(double a, int n)
	{
		int i = n;
		double b = a;
		
		i *= Math.log(b);
		double r = Math.pow(Math.E, i);
		
		return r;
	}
	public static boolean approxEqual(double x, double y)
	{
		final double EPSILON = 1E-12;
		return Math.abs(x-y) <= EPSILON;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 8.06;
		
		double r1 = Math.sqrt(Numeric.power(d, 2));
		System.out.println(Numeric.approxEqual(r1, d));
		
		double r2 = Math.sqrt(Numeric.cal(d, 2));
		System.out.println(Numeric.approxEqual(r2, d));
	}

}
