package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		System.out.print("국어 입력 : ");
		int kor=sc.nextInt();
		System.out.print("영어 입력 : ");
		int eng=sc.nextInt();
		System.out.print("수학 입력 : ");
		int math=sc.nextInt();
		char grade='F';
		
		double avg = (kor+eng+math)/3;
		boolean flag = false;
		//과목당 40점 미만이면 불합격
		//평균이 60점 이상인가, 40점 미만인가
		//합격 불합격 출력
		
//		if(kor<40 || eng<40 || math<40 || avg<60) {
//			System.out.println("불합격입니다.");
//		}
//		else if (avg>=60)
//			System.out.println("합격입니다.");
		
		if(avg>=60) {
			flag =true;
		}
		if(kor<40 || eng<40 || math<40) {
			flag=false;
		}
		else
			flag=true;
		
		if (flag)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}

}
