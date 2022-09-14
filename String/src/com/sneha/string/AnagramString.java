package com.sneha.string;
//5) Java Program to determine whether two strings are the anagram

public class AnagramString {

	public static void main(String[] args) {
		String str1 = "Read";
		String str2 = "Dear";
		int count = 0;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				char ch1 = str1.toLowerCase().charAt(i);
				for (int j=0; j < str2.length(); j++) {
					char ch2 = str2.toLowerCase().charAt(j);
					if(ch1 == ch2) {
						count++;
					}
				}
			}
			if(count == str1.length()) {
				System.out.println(str1+" and "+str2+" are Anagram");
			}
		}
		else
			System.out.println(str1+" and "+str2+" are not Anagram");
		
	}

}
