package com.biz.star;

public class Piramid {

	public static void main(String[] args) {
		int intNum = 1;
		for(int i=5; i>=1 ;i--)
		{
			for(int j=1; j<=i; j++) {
				System.out.print("_");
			}
			
			for(int k=1; k<=intNum;k++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			intNum++;
			
		}
		System.out.println("=======================");
		
		
		
		
		
		
	}

}
