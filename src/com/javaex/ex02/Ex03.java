package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름: ");
		String name = sc.nextLine();
		// 숫자를 받고 문자를 받을때는 nextInt가 버그가 있어서 다음 입력값을 못받음.
		// 엔터를 소비해줘야 문자열을 입력 가능함
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt();

		/*
		 * System.out.println("이름을 입력해 주세요."); System.out.print("이름: "); String name =
		 * sc.nextLine();
		 */

		System.out.println("키를 입력해 주세요.");
		System.out.print("키: ");
		int height = sc.nextInt();

		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 키는 " + height + "cm입니다.");

		sc.close();
	}
}
