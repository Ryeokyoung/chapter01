package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main (String[] args) {
		
		//Ex022
		/*철수는 편의점에서 아르바이트를 하고 있다
		 * 8시간 까지는 시간당 10000원 
		 * 8시간 초과시에는 시간당 1.5배를 받는다 
		 * 근무시간을 입력받아 임금을 계산하세요
		 * (단, 시간은 고려하지 않는다)
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("근무시간 : ");
		
		double st = sc.nextDouble();
		
		if(st>9) {
			double sumsalary1 = st*10000;
			System.out.println("임금은 "+sumsalary1+"원 입니다.");
		}else if(st>8) {
			double sumsalary1 = st*10000;
			double sumsalary2 = (double) (sumsalary1*1.5);
			System.out.println("임금은 "+sumsalary2+"원 입니다.");
		}
		sc.close();
	}
}
