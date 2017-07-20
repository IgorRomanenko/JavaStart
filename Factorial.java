package com.gmail.iggorrom;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int fac = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number (4...16) - ");
	     int n = sc.nextInt();
	     
	     if ( ( 4<n ) && ( n<16 ) ) {
			for (int i=1; i<=n; i+=1) {
				fac = fac * i;
			}
			 System.out.println( n + "! = " + fac);
		} else {
            System.out.println("ERROR!!! Input number from 4 to 16 ");
		}
	     sc.close();
	}
}
