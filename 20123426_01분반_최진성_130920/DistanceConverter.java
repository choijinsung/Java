public class DistanceConverter
{
	public static void main(String[] args)
	{
		final double yards = 3.5;
		final double feetPerYard = 3;
		final double inchesPerYard = 12;

		System.out.println(yards + "yards are " + yards*feetPerYard + "feet");
		System.out.println(yards + "yards are " + yards*inchesPerYard + "inches");
	}
}