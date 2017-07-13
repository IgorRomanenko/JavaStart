package com.gmail.irom356;

import java.util.Scanner;

public class Namber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
             int number1;
             int number2;
             int number3;
             int number4;
             int number5;
         
         System.out.println("Input number (5 Signs)");
             int number = sc.nextInt();
         
             number1 = number / 10000;
             number2 = (number % 10000) / 1000;
             number3 = (number / 100) % 10;
             number4 = (number / 10) % 10;
             number5 =  number % 10;
         
         System.out.println(number1);
         System.out.println(number2);
         System.out.println(number3);
         System.out.println(number4);
         System.out.println(number5);
         
	}
}
