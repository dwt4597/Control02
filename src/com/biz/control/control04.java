package com.biz.control;

public class control04 {

	public static void main(String[] args) {
		int intPay = 4758760;
		int intPaper = 50000;
		int count = 0;
		int index = 0;

		for (;;) {
			count = intPay / intPaper;
			intPay -= (intPaper * count);
			System.out.println(intPaper + "원권:" + count);

			// 만약 intPay가 0이 되어서
			// 더이상 화폐매수를 계산할 필요가
			// 없을때 그만 계산하라..
			if (intPay <= 0)
				break;

			if (index++ % 2 == 0)
				intPaper /= 5;
			else
				intPaper /= 2;
		}

	}

}
