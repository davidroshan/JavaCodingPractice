package com.coding.practice;

import java.util.HashSet;

public class CommonElementsInTwoArray {

	public static void main(String[] args) {
		Object[] obj1 =new Object[] {10,20,30,40,50};
		Object[] obj2 =new Object[] {50,60,70,80,90,20};
		commonElements(obj1,obj2);

	}

	private static void commonElements(Object[] object1, Object[] object2) {
		HashSet<Object> hs = new HashSet<Object>();
		for(Object element:object1) {
			hs.add(element);
		}
		
		for(Object element:object2) {
			if(hs.contains(element)) {
				System.out.println(element);
			}
		}
		
	}

}
