public class MilkJarCalculator
{
	public static void main(String[] args)
	{
		double milk = 5.5;
		double jarCapacity = 0.75;
		double completelyFilledJars = (int) (milk / jarCapacity);
		System.out.println(completelyFilledJars);
	}
}