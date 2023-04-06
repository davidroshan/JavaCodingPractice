package com.coding.practice;

public class SwapTwoStringsWithoutThirdVariable {

	public static void main(String[] args) {
		String firstString = "Hello";
		String secondString = "World";
		
		System.out.println("Before Swap the values:");
		System.out.println("firstString: "+firstString);
		System.out.println("secondString: "+secondString);
		
		System.out.println();
		System.out.println();
		
		firstString = firstString+secondString;
		secondString = firstString.substring(0, secondString.length());
		firstString = firstString.substring(firstString.length()-secondString.length(),
				                            firstString.length());
		System.out.println("After swap the values:");
		System.out.println("firstString: "+firstString);
		System.out.println("secondString: "+secondString);
	}

}
