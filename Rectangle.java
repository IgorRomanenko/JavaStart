package com.gmail.iggorrom;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Input a -");
	     int a = sc.nextInt();
		System.out.print("Input b -");
		 int b = sc.nextInt();

		 for (int i = 0; i < a; i++) {
			 for (int j = 0; j < b; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
}
