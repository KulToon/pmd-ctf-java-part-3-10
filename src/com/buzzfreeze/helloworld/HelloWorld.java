package com.buzzfreeze.helloworld;

public class HelloWorld {
	public static void main(String [] args) {
		
		// Lab Java Part 2 บท 6

		char[] myChar = { 'H', 'e', 'l', 'l', 'o' };
		String myWord = new String(myChar);
		System.out.println(myWord);
				
		// Lab Java Part 2 บท 7
		
		String str1 = "You and Me";
		String str2 = "you and me";
		//1
		System.out.println( str1.equals(str2) );
		//3
		System.out.println( str1.length() );
		//4
		System.out.println(str1.substring(1, 4));
		//5
		System.out.println(str1.trim());
		//4
		System.out.println(str1.substring(1, 4));
		//5
		System.out.println(str2.toUpperCase());
		//6
		System.out.println(str1.trim());
		
		
		// Lab Java Part 2 บท 8
		
		int[][] arr2 = {
				{1, 2, 3}, {4, 5, 6}, {7, 8, 9}
		};		
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
				
			}
		}
		
		
		
	}

}
