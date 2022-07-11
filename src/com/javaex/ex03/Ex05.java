package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main (String[] agrs) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("근무시간입력");
		int st = sc.nextInt();
		
				
		if(st>8) {
			int sumsalary1 = st*10000+(st-8)*2000;
			System.out.println("임금은 "+sumsalary1+"원 입니다.");
		}else if(st<9) {
			int sumsalary2 = st*10000;
			System.out.println("임금은 "+sumsalary2+"원 입니다.");
		}
	//Ex021
	/*철수는 편의점에서 아르바이트를 하고 있다
	 * 8시간 까지는 시간당 10000원 
	 * 8시간 초과시에는 시간당 12000원을 받는다 
	 * 근무시간을 입력받아 임금을 계산하세요
	 * (단, 시간은 고려하지 않는다)
	 * 
	 */
	
	sc.close();
		
	}
}

