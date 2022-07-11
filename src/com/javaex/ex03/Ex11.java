package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {
	public static void main (String[] agrs) {
		
	//~와 같으면 
		/*switch(변수){
		 * case 값1
		 * 변수의 값이 1일 때 실행내용 
		 * break;
		 * case 값2....... 
		 * 
		 * Q.과목번호는 1일 때 - 2일 때 - 3일 때 - .... 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목번호");
		int code = sc.nextInt();
		
		switch(code) {//code=1: 
			case 1: 
				System.out.println("101호");
				break;
			case 2:
				System.out.println("102호");
				break;
			case 3:
				System.out.println("103호");
				break;
			case 4:
				System.out.println("104호");
				break;	
			default:
				System.out.println("상담원");
				break;
		}
		sc.close();
	}
}
