package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.println("숫자:");
		
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("양수입니다");
			
		}else if(num<0) { //질문이 1개 더 있어서 if를 추가하여 else if로 작성됨 
			System.out.println("음수입니다");
		}else {
			System.out.println("0");
		}
			
		sc.close();
		
	}

	
}
