package com.biz.control;

public class lalala {

	public static void main(String[] args) {
		// 줄(i)의 수 마다, *의 갯수를 줄(i)의 갯수를 출력
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		/////////////////////////////////////////////////////////////////
		System.out.println("=======================");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		System.out.println();

		/////////////////////////////////////////////////////////////////
		System.out.println("=======================");

		int rowcount = 1;
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= rowcount; k++) {
				System.out.print("* ");
			}
			System.out.println();
			rowcount++;
		}
		/////////////////////////////////////////////////////////////////
		System.out.println("=======================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < 5; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
