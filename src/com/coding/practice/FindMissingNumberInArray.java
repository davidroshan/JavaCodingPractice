package com.coding.practice;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int a[] = {0,1,2,4,5,7,8,9};
        missingnumber(a);
	}
    
	public static void missingnumber(int a[]) {
		Set<Integer> set = new HashSet<Integer>();
		for(int num:a) {
			set.add(num);
		}
		
		int size = a.length;
		for(int i=0;i<=size;i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
	}
}
