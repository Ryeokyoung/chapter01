package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		
		int number = sc.nextInt();
		
		if(number>0 && number%2>0) {
			System.out.println("홀수");
		}else if(number>0 && number%2<1){
			System.out.println("짝수");
		}else if(number<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
			sc.close();
			
	}
}
