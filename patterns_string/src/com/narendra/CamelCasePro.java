package com.narendra;

import java.util.Scanner;
import java.util.stream.Stream;

public class CamelCasePro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String line = scanner.nextLine();
		
		StringBuilder fStr = new StringBuilder();
		
		Stream.of(line.split(" ")).forEach((str)->{
			
			String str1 = str.trim().toLowerCase();	
			str1 = str1.replaceAll("[^A-Za-z]", "");
			
			if(!str1.isEmpty()) {
				
				char[] charArray = str1.toCharArray();
				
				if(fStr.length() > 0) {
					charArray[0] = Character.toUpperCase(charArray[0]);
				}
				
				fStr.append(charArray).append(" ");
			}
		});
		System.out.println(fStr);
	}
}
