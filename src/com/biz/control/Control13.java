package com.biz.control;

public class Control13 {

	public static void main(String[] args) {
		int intPay = 5000;
		// 급여액이 3000 이하 이면 6%
		// 급여액이 3000 초과 10000 이하이면 9%
		// 10000을 초과하면 12%
		if (intPay <= 3000) {
			// 3000이하일때
			System.out.println("세금:" + (intPay * 0.06));
			// 이미 intPay 3000을 초과한 경우이므로
			// 굳이 intPay > 3000을 검사할 필요가
			// 없어져버렸다.
		} else if (intPay <= 10000) {
			System.out.println("세금:" + (intPay * 0.09));
			// 이미 intPay <= 10000인 모든 경우가
			// 사라져 버렸기 때문에
			// else만으로 나머지 조건을 처리하면 된다.
		} else {
			System.out.println("세금:" + (intPay * 0.12));

		}

	}

}
