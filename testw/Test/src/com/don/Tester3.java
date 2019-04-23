package com.don;

import java.util.Scanner;

public class Tester3 {

	public static void main(String[] args) {
		int a = 400000;
		Scanner scanner = new Scanner(System.in);
		System.out.println("多少人分:");
		String b= scanner.nextLine();
		int b1 = Integer.parseInt(b);
		try {
			System.out.println("每人得:"+ (a/b1));
		}catch(Exception e) {
		
		}
	}
}
