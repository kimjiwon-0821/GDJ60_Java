package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//id,pw를 입력하여 로그인 - 실패하면 5번 재 로그인 가능
		//반복문 종료후, 로그인이 성공했으면 "환영합니다." 실패했으면 "은행 방문하세요" 출력
		int id = 1234;
		int pw = 5678;
		int count=0;
		boolean check = false;
		
		for(int i=0;i<5;i++) {
			System.out.print("id를 입력하세요 : ");
			int idu=sc.nextInt();
			System.out.print("pw를 입력하세요 : ");
			int pwu = sc.nextInt();
			
			if (id==idu &&pw==pwu) {
				i=5;
				check = true;
			}
			else {
				if(count==4)
					System.out.println("로그인 실패.");
				else
				System.out.println("로그인 실패. 재로그인해주세요.");
				count++;
			}
		}
		
//		if(count<5)
//			System.out.println("환영합니다!");
//		else if (count==5)
//			System.out.println("은행에 방문하세요."); //횟수로 판별
		if(check==true)
			System.out.println("환영합니다.");
		else 
			System.out.println("은행에 방문하세요.");//참,거짓으로 판별
	}

}
