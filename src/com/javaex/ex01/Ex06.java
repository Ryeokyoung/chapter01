package com.javaex.ex01;

public class Ex06 {

	public static void main (String[]args) { 
			
			//자동형변환 
			System.out.println(2+3.5);
			
			double var01 = 2+3.5; //2-->2.0으로 자동형변환
			System.out.println(var01);
			
			
			//자동 
			long var02 = 12345L;
			float var03 = 1.1F;
			System.out.println(var02 + var03);
			
			float result = var02 + var03; //(정수 + 실수 =  실수형)
			//long result = var02 + var03; 소수점 때문에 error 
			System.out.println(result);
			
			/*
			  형변환 규칙 
			byte > short > int > long > float > double 
			     > char  
			 */
			
			//강제형변환 
			float var04 = 1111.2345f;
			int var05 = (int)var04;//실수 > 정수 시 강제 소수점버림 
			System.out.println(var05); //1111
			
			
			
			
			
			/*
			 int iValue = 10; 
			 byte bValue = (byte)iValue; //강제 
			 (int > byte) ; //10 
			 글자수 타입이 byte공간에 딱 맞음 
			 
			 
			 int intValue = 103029770;
			 byte byteValue =(byte)intValue; //강제불가 
			  (int > byte) ; //error 
			 글자수 타입이 byte공간을 넘음   
			 */
			
			//축소변환 
			int v01 = 10; 
			byte v02 = (byte)v01; 
			System.out.println(v02);
			
			//확대 
			byte v05 = 10; 
			int v07 = (int)v05; 
			System.out.println(v07);
			//늘리는 건 문제 없음 축소변환이 문제 
			
			
			//실수 > 정수 
			double v077 = 5.57; 
			int v08 = (int)v077; //소수점버림 
			System.out.println(v08);
			
			//정수 > 실수 
			int v09 = 7; 
			double v10 = (double)v09; 
			System.out.println(v10); //7.0 
		}
	}
}
