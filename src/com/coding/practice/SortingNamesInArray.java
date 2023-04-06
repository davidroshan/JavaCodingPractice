package com.coding.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortingNamesInArray {

	public static void main(String[] args) {
		int n;
		String temp;
		String names[];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of items you want to sort:");
		n = sc.nextInt();
		names = new String[n];
		sc = new Scanner(System.in);
		System.out.println("Enter words:");
		for(int i=0;i<n;i++) {
			names[i]=sc.nextLine();
		}
		System.out.println("Name items: "+Arrays.toString(names));
        
		//Sorting names array
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(names[i].compareTo(names[j])>0) {
					temp = names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted name items: "+Arrays.toString(names));
		
	}

}
