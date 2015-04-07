public class ConcatTester
{
	public static void main(String[] args)
	{
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";

		String sentence = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(animal2);
		System.out.println(sentence);
		System.out.println("length : " + sentence.length());
	}
}