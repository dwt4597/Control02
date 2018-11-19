package com.biz.control;

public class zzz {

	public static void main(String[] args) {
		int intNov=3;
		for (int i = 0; i < 7; i++) {
			int week = (intNov++ % 7); // 0~6
			System.out.println(week);
		}

	}
}
