package com.coding.practice;

import java.util.*;

public class TriangleNihar {
	public static void main(String srgs[]) {

		{
			System.out.println("Enter the Row numbers : ");
			Scanner sc = new Scanner(System.in);
			int rowCount = sc.nextInt();

			for (int i = 1; i <= rowCount; i++) {

				for (int j = rowCount; j >= i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}

				System.out.println();
			}
		}
	}

}
