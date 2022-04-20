package com.javaex.practice;

import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {
		
		// if 조건을 <op == "+"> 라고 하면 인식하지 못함 >>> String type은 내용이 아닌 메모리 주소를 인식해서 다른 객체라고 받아들이는 듯
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String op = sc.nextLine();
		
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		
		if (op.equals("+")) {
			System.out.println("결과는: " + (num1 + num2));
		
		} else if (op.equals("-")) {
			System.out.println("결과는: " + (num1 - num2));
			
		} else if (op.equals("*")) {
			System.out.println("결과는: " + (num1 * num2));
			
		} else if (op.equals("/")) {
			if (num2 == 0) {
				System.out.println("계산할 수 없습니다.");
				
			} else {
				System.out.println("결과는: " + num1 / num2);
				
			}
			
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
			
		}
		
		sc.close();
		
	}

}
