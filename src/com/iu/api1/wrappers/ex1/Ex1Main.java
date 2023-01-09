package com.iu.api1.wrappers.ex1;

import java.util.Scanner;

public class Ex1Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 입력");//000729-1234567
		String jumin = sc.next();
//		JuminCheck jc = new JuminCheck();
//		jc.check1(jumin);
//		jc.check2(jumin);
		JuminCheck2 jc2 = new JuminCheck2();
		jc2.check(jumin);
		
	}

}
