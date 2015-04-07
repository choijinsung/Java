import java.util.*;

public class StringManips
{
	public static void main(String[] args)
	{
		String phrase = new String("This is a String test.");
		int phraseLength;
		int middleIndex;
		String firstHalf;
		String secondHalf;
		String switchedPhrase;

		phraseLength = phrase.length();
		middleIndex = phraseLength/2;

		firstHalf = phrase.substring(0, middleIndex);
		secondHalf = phrase.substring(middleIndex, phraseLength);

		switchedPhrase = secondHalf.concat(firstHalf);

		System.out.println();
		System.out.println("Original phrase: " + phrase);
		System.out.println("Length of the phrase: " + phraseLength + " characters");
		System.out.println("Index of the middle: " + middleIndex);
		System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));
		System.out.println("Switched phrase: " + switchedPhrase);

		String phrase2 = "phrase";
		String middle3 = phrase2.substring(2, 5);

		System.out.println("Substring of phrase2 is " + middle3);

		StringTokenizer mystery = new StringTokenizer(switchedPhrase);

		while(mystery.hasMoreTokens())
		{
			System.out.print(mystery.nextToken());
			System.out.print("*");
		}

		System.out.println();

		Scanner stdin = new Scanner(System.in);

		System.out.print("Enter a country: ");
		String country = stdin.nextLine();
		System.out.print("Enter a city: ");
		String city = stdin.nextLine();

		System.out.println(country.toUpperCase() + city.toLowerCase() + country.toUpperCase());
	}
}