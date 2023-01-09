package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {
	public static void main(String[] args) {
		//회원가입 할 때 입력한 ID,PW
		int id = 1234;
		int pw = 5678;
		System.out.println("아이디와 패스워드를 입력하세요");
		
		//키보드로부터 id, pw를 입력받아서 로그인 처리
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		int idn = sc.nextInt();
		System.out.print("pw : ");
		int pwn = sc.nextInt();
		
		if(id==idn && pw==pwn) {
			System.out.println("로그인 되셨습니다.");
		}
		else
			System.out.println("로그인 실패");
		
	}

}
