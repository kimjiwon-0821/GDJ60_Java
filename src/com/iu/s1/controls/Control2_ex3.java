package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {
	public static void main(String[] args) {
		int id = 1234;
		int pw = 5678;
		System.out.println("아이디와 패스워드를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		int idn = sc.nextInt();
		System.out.print("pw : ");
		int pwn = sc.nextInt();
		int money;
		int n=0;
		
		if(id==idn && pw==pwn) {
			System.out.println("로그인 되셨습니다.");
		}
		else
			System.out.println("로그인 실패");
		//로그인이 성공했을때만 실행
		//급여 입력
		//정규직이면 1, 계약직이면 2를 입력받음
		//실급여 계산
		//정규직: 고용보험 2%, 의료보험 3%, 국민연금 1%, 산재보험 1%
		//계약직 : 원천징수 3.3%
		
		if(id==idn && pw==pwn) {
			System.out.println("급여를 입력하세요");
			System.out.print("급여 : ");
			money = sc.nextInt();
			System.out.println("정규직이면 1, 계약직이면 2를 입력하세요");
			n=sc.nextInt();
			if(n==1) {
				money = money-(money*7/100);
				System.out.println("실급여 : "+money);
			}
			else if(n==2) {
				money=money-(money*33/1000);
				System.out.println("실급여 : "+money);
			}
		}
		
		
	}

}
