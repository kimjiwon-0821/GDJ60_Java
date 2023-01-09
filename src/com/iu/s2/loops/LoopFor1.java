package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("반복문 횟수를 입력하세요");
		int count=sc.nextInt();
		int i;
		for (i=5;i<i+count;i++) {
			System.out.println("Hello World!");
			System.out.println("Good Bye");
		}
		
		System.out.println(i);
		System.out.println("Finish");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("반복문의 횟수를 입력하세요");
//		int a=sc.nextInt();
//		int i=0;
//		for(;i<a;i++) {
//			System.out.println(i+"이 찍혔습니다.");
//		}
//		System.out.println("총"+ i+"번 찍혔습니다.");
//		System.out.println("Finish");
	}

}