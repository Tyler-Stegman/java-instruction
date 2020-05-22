package ui;

import java.util.Arrays;

import util.Console;

public class PigLatinTranslatorApp {
	
	/*public static void main(String[] args) {
		System.out.println("Welcoime to the PigLatin coder!");
		String english = "";
		
		
		english = Console.getString("Enter a word or phrase: ");
		
		System.out.println(convertToLatin(english));
		
	}

	
	private static String convertToLatin(String english) {
		String end ="";
		String spaces ="\\s+";
		String[]words = english.split(spaces);
		for (int i=0; i <words.length;i++) {
			if (isVowel(words[i].toLowerCase().charAt(0))) {
				end+= words[i] + "ay";
			}else {
				end += words[i].substring(1)+ words[i].substring(0,1)+ "ay ";
			}
		}
		return end;
		
	}


	private static boolean isVowel(char c) {
		if (c =='a')
		return true;
		if (c =='e')
			return true;
		if (c =='i')
			return true;
		if (c =='o')
			return true;
		if (c =='u')
			return true;
		return false;
		
	}*/
	
	public static boolean isVowel(char c) {
		String vowels = "aeiouAEIOU";
		return (vowels.indexOf(c) >= 0);
	}
	public static String pigLatinWord(String s) {
		String pigWord;
		if (isVowel(s.charAt(0))) {
			pigWord = s + "way";
		}
		else if (s.startsWith("th") || s.startsWith("Th")) {
			pigWord = s.substring(2) + s.substring(0,2) + "ay";
		}
		else {
			pigWord = s.substring(1,s.length()) + s.charAt(0) + "ay";
		}
		return pigWord;
	}

	public static void main(String[] args) {
		// Welcome
		System.out.println("Pig Latin Calculator");
		System.out.println();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// User Input

			String line = Console.getString("Enter a word: ").toLowerCase();
			System.out.println(pigLatinWord(line));
			

			// Business Logic

			// output
			choice = Console.getString("Another word? (y/n): ", "y", "n");
		}

		// exit statement
		System.out.println("Thank you for using the Pig Latin Translator");
	}

}
