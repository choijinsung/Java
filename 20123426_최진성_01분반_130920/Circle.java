import java.util.*;

public class Circle
{
	public static void main(String[] args)
	{
		final double PI = 3.14159;

		Scanner stdin = new Scanner(System.in);

		System.out.println("Please enter a value for the radius: ");

		int radius = stdin.nextInt();
		double area = PI * radius * radius;
		double circumference = 2 * PI * radius;

		System.out.println("The area of a circle with radius " + radius + " is " + area);
		System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);

		int radius2 = radius * 2;
		double area2 = PI * radius2 * radius2;
		double circumference2 = 2 * PI * radius2;

		System.out.println("The area of a circle with radius " + radius2 + " is " + area2);
		System.out.println("The circumference of a circle with radius " + radius2 + " is " + circumference2);

		System.out.println(area2/area);
		System.out.println(circumference2/circumference);
	}
}