package com.sneha.string;
//3) Java Program to count the total number of punctuation characters exists in a String
public class CountPuncuation {

	public static void main(String[] args) {
		String name = "He said, Why do you come and disturb me? What a nuisance you are! Why can’t you play somewhere else? "
				+ "Can’t you see that I want to work? Go away at once and do not come here again.";
		int count = 0;
		for(int i = 0; i< name.length(); i++) {
			char ch = name.charAt(i);
			if(ch == '!' || ch == ',' || ch == ';' || ch == '.' || ch == '-' || ch == '"' || ch == '?' || ch == ';' || ch == '/') {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
