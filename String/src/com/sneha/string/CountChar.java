package com.sneha.string;

import java.util.Collections;
import java.util.HashMap;

public class CountChar {

	public static void main(String[] args) {
		String name = "Hello World";
		int count;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < name.length(); i++) {
			count = 0;
			char ch = name.charAt(i);
			for (int j = 0; j < name.length(); j++) {
				if(ch == name.charAt(j)) {
					count++;
				}
			}
			if(ch != ' ') {
				map.put(ch, count);
			}
		}
		System.out.println(map.keySet());
		System.out.println(map);
		
	}

}
