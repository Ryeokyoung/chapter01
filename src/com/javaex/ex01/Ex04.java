package com.javaex.ex01;

public class Ex04 {

	public static void main (String [] agrs) { 
		
		char ch01 = 'A';
		char ch02 = '안';
		
		System.out.println(ch01);
		System.out.println(ch02);

		char ch03 = 65;//cho3의 값이 65일 때 사용 
		//int ch03 = 65; 는 정수형으로 계산 
		System.out.println(ch03);
		//char ch03 = '65';은 65 가 2개의 글자이므로 ERROR .. 
		
		//왜 'A'로 나오는가? 
		//코드표상의 A의 값이 65이므로 65로 저장된 A가 출력됨 
		
		//char ch04 = 3; //코드값 3
		char ch04 = '3'; //글자 3으로 출력하고 싶을 때 
		System.out.println(ch04);
		
		String str = "안"; //String은 " "
		System.out.println(str);
}
}

