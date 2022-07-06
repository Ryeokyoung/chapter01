package com.javaex.ex01;

public class Ex01 {

	public static void main (String[] args) { 
		
		/*
		 * int myAge;
		 * myAge = 26; 
		 * myAge = 27; 
		 * System.out.println("my age:" + myAge);
		 
		 * */
		
		byte no; //변수선언 
		no = 125;  //초기화 
		System.out.println("no :" + no);
		
		
		
		no = 127; //재 초기화 
		
		
		
		System.out.println("no :" + no);
		
		no++; //byte의 범위는 127까지라서 127이 넘어간 후 -단위로 계산됨.. //-128 = -(127 + 1) 왜 그러는지는 나도 모름... 
		no++; // -128 - +1 = -127 
		System.out.println("no :" + no);
		
		//float nnn = float.MAX_VALUE;
		//int vs Integer 
		//int 산술연산 가능, null 초기화 불가능 
		//Integer unboxing 상태에서 연산불가, null값 처리 가능(SQL사용용이) 
		
		integer nnn = integer.MAX_VALUE;
		
		
		
		
		
	}
}
