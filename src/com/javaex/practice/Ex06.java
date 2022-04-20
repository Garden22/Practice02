package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("큰수: " + num1 + "\t" + "작은수: " + num2 + "입니다.");
			
		} else { // num2가 큰수이거나 num1 == num2인 경우
			System.out.println("큰수: " + num2 + "\t" + "작은수: " + num1 + "입니다.");
			
		}
		
		// tab 간격을 어떻게 조절해야...?

		
		sc.close();
		
	}

}
