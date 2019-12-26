package com.narendra;

import java.util.Scanner;

public class StarPramid {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Height: ");
		int h = scanner.nextInt();	
		//int z = h;
		
		for(int i=0; i<h; i++) {
			
			for(int x=h; x>i; x--) {
				System.out.print(" ");
			}
			
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
				//System.out.print(i);
				//System.out.print(z);
			}
			//z--;
			System.out.println();
		}
	}
}
