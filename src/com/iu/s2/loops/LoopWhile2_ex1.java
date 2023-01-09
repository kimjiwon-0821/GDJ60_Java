package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {
	public static void main(String[] args) {
		//MMORPG게임
		//1. 로그인
		//2. 로그인 한 사용자만 게임 가능 -> 로그인 될때까지
		
		//----------로그인파트-----------------
		//1.로그인 2. 종료
		//1번 누르면 아이디,패스워드 입력 후, 로그인 판단 -> 맞으면 로그인 성공, 틀리면 재로그인
		//2번 누르면 종료
		
		//-----게임 진행 파트-------------
		//1. 로그인 성공 햇을 때 진행 가능
		//레벨은 1로 시작
		//G=0; 5렙 달성시, 1000G지급; 10렙 달성시, 2000G지급;    15렙 달성시, 3000G지급 vv
		// 모든 몬스터의 경험치는 동일
		//레벨 1->2 몬스터 3마리                1마리 잡을때마다"몬스터 사냥 성공"
		//레벨업 할때마다 "축 레벨업"
		//2-3 몬스터 6마리
		//3-4 몬스터 9마리
		//4-5 몬스터 12마리
		// 레벨 14-15 52마리 --->레벨업 종료
		//15렙 달성시, 만렙 달성 축하. 현재 G 출력->6000골드
		Scanner sc = new Scanner(System.in);
		int id = 1234;//회원가입 아이디
		int pw = 5678;//회원가입 비밀번호
		boolean check = true;
		int login=0;
//		로그인 파트
		while(check) {
			System.out.println("1.로그인 2. 종료");
			int select=sc.nextInt();
			switch(select) {//강사님은 여기서 if-else문 사용
			case 1:
				System.out.print("id : ");
				int uid=sc.nextInt();
				System.out.print("pw : ");
				int upw=sc.nextInt();
				if(id==uid &&pw ==upw) {
					System.out.println("로그인 성공");
					login =1;
					check=false;
				}
				else
					System.out.println("로그인 실패");
				break;//로그인 시도
			case 2:
				System.out.println("프로그램을 종료합니다.");
				check=false;//종료
			}
			/* 강사님 로그인파트 코드
			 * if(select ==1) { System.out.print("id : "); int uid=sc.nextInt();
			 * System.out.print("pw : "); int upw=sc.nextInt(); if(id==uid &&pw ==upw) {
			 * System.out.println("로그인 성공"); login =1; break; } else
			 * System.out.println("로그인 실패"); break;//로그인 시도 } else {
			 * System.out.println("프로그램을 종료합니다."); check=false;//종료 }
			 */		
			}//로그인파트 끝
		
//		게임파트
		System.out.println();
		System.out.println("--게임을 시작합니다--");
		int money =0;
		if(login==1) {
			for(int level=2;level<=15;level++) {
				System.out.println("현재 레벨 : "+(level-1));
				for(int monster=1;monster<=(level-1)*3;monster++) {
				System.out.println(monster+ "번째 몬스터 사냥 성공");
				}//몬스터 사냥 레벨업
				
				System.out.println("-- 축 "+level+" 레벨업 --");
				System.out.println();
				
				if (level%5==0) {
					money+= level*200;
					System.out.println(level+"렙 달성 "+ level*200+"GOLD 지급");
					System.out.println();
				}//달성 GOLD 지급
				
				if(level==15) {
					System.out.println("만렙 달성을 축하합니다.");
					System.out.println("현재 GOLD : "+money);
					System.out.println();
					System.out.println("레벌업을 종료합니다.");
				}//만렙 달성
			}//게임 레벨업
			
		}//게임 파트끝
		
		
	}

}//속 쓰리다아아...