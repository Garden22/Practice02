package com.javaex.practice;

import java.util.Scanner;

public class Ex14_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해주세요");
		System.out.print("금액: ");
		
		int income = sc.nextInt();
		double tax = 0;
		
		if (income >= 8000) {
			tax += 0.36 * (income - 8000);
			income = 8000;
		
		}
		
		if (income > 4000) {
			tax += 0.27 * (income - 4000);
			income = 4000;
			
		}
		
		if (income > 1000) {
			tax += 0.18 * (income - 1000);
			income = 1000;
			
		}
		
		if (income >= 0) {
			tax += 0.09 * income;
			income = 0;
			
		}
		
		if (income == 0) {
			System.out.println("소득세는 " + tax + "입니다.");
			
		} else {
			System.out.println("잘못입력했습니다.");
			
		}
		
		sc.close();

	}

}
