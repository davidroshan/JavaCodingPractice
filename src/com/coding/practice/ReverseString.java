package com.coding.practice;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Malay";
		char ch;
		String rs="";

		System.out.println(s);
		//System.out.println(s.hashCode());
        
		for(int i=0;i<s.length();i++) {
			ch = s.charAt(i);
			rs = ch+rs;
		}
		System.out.println(rs);
		
		String toReverse = "david";
		char [] stringToArray = toReverse.toCharArray();
		int left = 0;
		int right =0;
		right = stringToArray.length-1;
		
		for(left=0;left<right;left++,right--) {
			char temp = stringToArray[left];
			stringToArray[left]=stringToArray[right];
			stringToArray[right]=temp;
		}
		String reverseString = new String(stringToArray);
		System.out.println(reverseString);
	}

}
