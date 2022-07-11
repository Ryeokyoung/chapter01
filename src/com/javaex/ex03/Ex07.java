package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
	public static void main (String[] args) {
		
		/*ex09 점수를 입력받아 입력된 수가 3의 배수인지 
		 * 판별하는 프로그램 작성
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int num = sc.nextInt();
		//int inputt = num%3;
		//%나머지연산자: 왼쪽 피연산자를 오른쪽 피연산자로 나눴을 때 나머지) 
		if (num%3==0) {
			System.out.println("3의 배수입니다");
		}else {
			System.out.println("3의배수가 아닙니다");
		}
			
			sc.close();
		
	}
}
