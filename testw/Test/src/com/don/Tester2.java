package com.don;

import java.util.Scanner;

public class Tester2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ƾǦ��Z:");
		String a= scanner.nextLine();
		int a1=Integer.parseInt(a);
		try {
		}catch(Exception e) {
		System.out.println("��J���~");
		}
		System.out.println("�^�妨�Z:");
		String b= scanner.nextLine();
		int b1=Integer.parseInt(b);
		try {
		System.out.println("����"+(a1+b1)/2);
		}catch(Exception e) {
		System.out.println("��J���~");
		}
		
  }
}
