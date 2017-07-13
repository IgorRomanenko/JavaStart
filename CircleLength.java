package com.gmail.irom356;

import java.util.Scanner;

public class CircleLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc = new Scanner(System.in);
		System.out.print("Input radius = ");
	    double radius = sc.nextDouble();
	    
	    double length;
	    
	    length = 2 * Math.PI * radius;
	    
	    System.out.println("Lehght = " +length);
	}
}
