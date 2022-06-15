package runner;

public class FindString {

	String sentence = "hello, my name is jimin. i am doing fine, how are you? k thx bai";
	String wordToFind = "fine";

	UserInput userInput = new UserInput();

	public String WordFinder() {

//		System.out.println("Please enter a sentence: ");
//		sentence = userInput.getString();
//
//		System.out.println("Great! Now enter the word you want to find within the sentence: ");
//		wordToFind = userInput.getString();

		if (sentence.contains(wordToFind)) {
			// Splits the sentence between each word, making each string an array
			String[] sentenceArr = sentence.split(" ");

			for (String str : sentenceArr) {
				if (str.equals(wordToFind)) {
					return "Your word was: " + str + ".";
				} else {
					return "That word is not in this sentence.";
				}
			}
		}
		return null;
	}

	public String WordLocation() {

		System.out.println("Please enter a sentence: ");
		sentence = userInput.getString();

		System.out.println("Great! Now enter the word you want to find within the sentence: ");
		wordToFind = userInput.getString();

		if (sentence.contains(wordToFind)) {
			// Splits the sentence between each word, making each string an array
			String[] sentenceArr = sentence.split(" ");

			for (int i = 0; i < sentenceArr.length; i++) {
				if (sentenceArr[i].equals(wordToFind)) {
					System.out.println("The location of " + wordToFind + " is: " + i);
				} else {
					return "Sorry, that word doesn't seem to be in this sentence";
				}
			}
		}
		return null;
	}
}