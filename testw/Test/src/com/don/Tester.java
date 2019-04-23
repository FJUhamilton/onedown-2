package com.don;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		int a = 400000;
		Scanner scanner = new Scanner(System.in);
		System.out.println("多少人分:");
		int b= scanner.nextInt();
		int c = (a/b);
		System.out.println("每人得:"+c);
		
	}

}
