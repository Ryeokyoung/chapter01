package com.javaex.ex01;

public class Ex02 {

	public static void main(String[] args) {
		
	//	double var01; //공간만들기 
	//	var01 = 3.14; //변수초기화 
	
		double var01 = 3.14; //한방에 넣기 변수선언 및 변수초기화 
		//float var02 = 3.14; //error 'float'은 f를 꼭 써야함' 
		float var02 = 3.14F;
		
		double var03 = 3.123456789123456789123456789; 
		//float보다 정확함 
		float var04 = 3.123456789123456789123456789F;
		//7번째 자리이후 버림 
		
		
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		System.out.println(var04);
		
		
	}
}
