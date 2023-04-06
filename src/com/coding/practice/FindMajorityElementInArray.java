package com.coding.practice;
import java.util.HashMap;
import java.util.Map;

//majority element means number of occurence of an element more than 
//or equal to the (size of the array)/2


public class FindMajorityElementInArray {

	public static void main(String[] args) {
		int [] a = {2,2,3,3,3,5,5,6,8,9,11,11,11,11,11,11,11,11,11};
		int size = a.length;
		System.out.println(size);
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		map.put(100, 1);
//		map.put(200, 2);
//		map.put(300, 3);
//		map.put(400, 4);
//		map.put(500, 5);
//		System.out.println(map);
//		System.out.println(map.get(300));
//		System.out.println(map.get(1000));
//	    System.out.println(map.entrySet());
//	    for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
//	    	System.out.println(entry);
//	    	System.out.println(entry.getKey());
//	    	System.out.println(entry.getValue());
//	    }
		
		int majorElement = majorityElement(a, size);
		System.out.println("Major Element in the array is: "+majorElement);

	}

	public static int majorityElement(int [] a,int size) {
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(Integer i:a) {
			Integer value = map.get(i);
			if(value==null) {
				map.put(i, 1);
			}
			else {
				map.put(i, value+1);
			}
		}
		System.out.println(map);
		System.out.println(size/2);
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>=size/2) {
				return entry.getKey();
			}
		}
		return -1;
	}
}
