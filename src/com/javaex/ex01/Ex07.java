package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) { 
		
		double v01 = 5/4; //5/4 
		System.out.println(v01); // 1 -- 5/4로 계산 몫만 결과값으로 나옴 
		System.out.println(5/4); // 1
		
		
		double v02 = (double)5/4; //5.0/4.0
		System.out.println(v02); //1.25
		
		double v03 = 5/(double)4; //5/4.0 
		System.out.println(v03);//1.25
		
		double v04 = (double)5 / (double)4; //5.0./4.0
		System.out.println(v04);//1.25

		int v05 = (int)1.3 + (int)1.8; //1+1
		System.out.println(v05);//2 
	}
}
