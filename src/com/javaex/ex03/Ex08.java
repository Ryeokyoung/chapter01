package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main (String[] args) {
		
		/*점수를 입력받아 프로그램 작성
		 * 90점 이상 A
		 * 80점 이상 B 
		 * 70점 이상 C 
		 * 60점 이상 D
		 * 60 미만 F 
		 */
		
		//&&:그리고
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력");
		int point = sc.nextInt();
		
		/*if (point<89) {
			System.out.println("A");
		}else if(point<79) {
			
		}*/
		
		if(point>=90) {
			System.out.println("A");
		}else if(90>point && point >=80) {
			System.out.println("b");
		}else if(80>point && point >=70) {
			System.out.println("c");
		}else if(70>point && point >=60) {
			System.out.println("d");
		}else {
			System.out.println("f");
		}
		sc.close();
	}

		
}
