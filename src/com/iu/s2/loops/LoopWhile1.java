package com.iu.s2.loops;

import java.util.Random;
import java.util.Scanner;

public class LoopWhile1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(10);
		boolean check = true;
		int count=1;
		while(check) {
			System.out.println("숫자를 입력하세요");
			int a = sc.nextInt();
			if(num==a) {
				System.out.println("번호가 일치합니다.");
				break;
			}
		System.out.println("틀렸습니다.");
			count++;
		}
		System.out.println(count+"만에 맞췄습니다.");
	}

}
