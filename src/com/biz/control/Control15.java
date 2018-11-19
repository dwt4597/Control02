package com.biz.control;

public class Control15 {

	public static void main(String[] args) {
		int intCount = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				intCount++;

			}
		}
		System.out.println(intCount);

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(j + " x " + i + " = " + (j * i));

			}
			System.out.println("=======================");
		}

		for (int i = 1; i < 7; i++) {
			System.out.println("*");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
		}
		System.out.println();
	
		System.out.println("=======================");
		for(int i=7; i>1 ;i--) {
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
		
		System.out.println();
/*
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < 8; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}*/
	}
}
