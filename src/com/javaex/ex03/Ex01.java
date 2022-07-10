package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main (String[] args) {
		
		/*이전내용복습
		 * 변수는 소문자로 작성 
		 * 상수는 PI등 대문자로 표시, final처리하면 -무조건 상수 
		 * 식별자는 카멜표기법사용 ex) personalColor  
		 */
		
		
		 //점수를 입력받아 점수가 60이상이면 합격입니다 출력 
		Scanner sc = new Scanner(System.in);
		System.out.println("점수");
		
		int point = sc.nextInt();
		
		if(point>=60) {
			System.out.println("합격입니다");
		}
		sc.close();
		
	}
}
