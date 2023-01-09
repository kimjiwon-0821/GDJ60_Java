package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//학생수 입력받음 
		//학생수만큼 점수를 입력 받음
		//총 합계를 출력하세요.
//		int sum=0;
//		System.out.print("학생 수를 입력하세요 : ");
//		int num = sc.nextInt();
//		for(int i=1;i<=num;i++) {
//			System.out.print("학생"+i+"의 점수를 입력하세요:");
//			int grade=sc.nextInt();
//			sum+=grade;
//		}
//		System.out.println("학생들의 점수 총합은 "+ sum+"입니다.");
		
		System.out.println("초를 입력하세요 : ");
		int sec=sc.nextInt();
		for(int i=0;i<60;i++) { //for문은 수정하지 말것
			if(i<sec)
				System.out.println(i+1+"초");
			else if(i==sec)
				i=60;
		}
		System.out.println("종료");
	}

}
