package com.gmail.iggorrom;

import java.util.Scanner;

public class DrawsWwallpaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Inpur number lines - ");
	     int line = sc.nextInt();
	     
	     for (int i = 1; i <= 5; i+=1) {
	    	 for (int j = 1; j <= line; j+=1) {
                  if (j % 2 == 0) {
					System.out.print("+++");
				} else {
                    System.out.print("***");
				}				
			}
		 System.out.println(); 	     
		}
	     sc.close();
	}
}
