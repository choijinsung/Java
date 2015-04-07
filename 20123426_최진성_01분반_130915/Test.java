public class Test
{
	public static void main(String[] args)
	{
		String test = "This is a Test";
		String smallTest = test.toLowerCase();
		System.out.println(test);
		System.out.println(smallTest);
		String bigTestString = smallTest.toUpperCase();
		System.out.println(bigTestString);
	}
}