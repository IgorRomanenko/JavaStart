package com.gmail.irom356;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input side a = ");
		    double sideA = sc.nextDouble();
		System.out.print("Input side b = ");
		    double sideB = sc.nextDouble();
		System.out.print("Input side c = ");
		    double sideC = sc.nextDouble();
		
		    double p;
		    double area;
		
		    p = (sideA + sideB + sideC) / 2;
		    area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
		    
		System.out.println("Area = " + area);
	}

}
