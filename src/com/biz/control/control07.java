package com.biz.control;

public class control07 {

	public static void main(String[] args) {

		int intNum = 0;
		for (intNum = 0; intNum < 100; intNum++) {
			System.out.println(intNum);

		}

		System.out.println("Last Num:" + intNum);

		for (int i = 0; i < 100; i++) {
			System.out.println(i);

		}
		// System.out.println(i);

		int intCount = 0;
		while (++intCount < 10) {

			// if(++intCount > 10)
			// break;

			System.out.println(intCount + "대한민국");

		}

		// while문이 무한반복이라서, while다음 문장이 실행안됨
		// System.out.println("대한민국");

	}

}
