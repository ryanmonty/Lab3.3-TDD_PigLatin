import java.util.Scanner;

public class PigLatin {
	private static Scanner sc = new Scanner(System.in);


	public static Boolean isVowel(char c) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		String s = String.valueOf(c);
		String vs = new String(vowels);
		if (vs.contains(s)) {
			return true;
		} else {
			return false;
		}
	}

	public static String translate(String input) {
		input = input.toLowerCase();
		char firstLetter = input.toCharArray()[0];
		String output = "";
		
		Boolean noVowels = true;
		for (char letter : input.toCharArray()) {
			if (isVowel(letter)) {
				noVowels = false;
			}
		}

		if (noVowels) {
			System.out.println(input + " doesn't include any vowels, so we can't play...");
			return input;
		}

		if (isVowel(firstLetter) == true) {
			output = input + "way";

		} else {
			int vowelIndex = 0;

			for (int i = 0; i <= input.length(); i++) {
				if (isVowel(input.toCharArray()[i]) == true) {
					vowelIndex = i;
					break;
				}
			}

			String vowelPlus = input.substring(vowelIndex);
			String preVowel = input.substring(0, vowelIndex);

			output = vowelPlus + preVowel + "ay";
		}

		System.out.println(output);
		return output;
	}

}
