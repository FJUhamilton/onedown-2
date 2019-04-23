package com.don;

import java.util.Scanner;

public class Tester2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("數學成績:");
		String a= scanner.nextLine();
		int a1=Integer.parseInt(a);
		try {
		}catch(Exception e) {
		System.out.println("輸入錯誤");
		}
		System.out.println("英文成績:");
		String b= scanner.nextLine();
		int b1=Integer.parseInt(b);
		try {
		System.out.println("平均"+(a1+b1)/2);
		}catch(Exception e) {
		System.out.println("輸入錯誤");
		}
		
  }
}
