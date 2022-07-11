package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] agrs) {
		/* 월을 입력받아 해당월의 일수를 출력하는 프로그램작성 */

		//
		Scanner sc = new Scanner(System.in);
		System.out.println("월 입력");
		int month = sc.nextInt();
	
		/*switch (month) {
		case 1:
			System.out.println("31일");
			break;
			
		}*/
		//메모리가 작은 옛날에는 아래처럼 썼음... 
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28");
			break;
		default:
			System.out.println("31");
			break;
			
		}
		/*if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			System.out.println("30");
		} else if(month == 2){
			System.out.println("28");
		} else {
			System.out.println("31");
		}
		*/
	sc.close();
	}
}
