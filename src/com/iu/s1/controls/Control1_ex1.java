package com.iu.s1.controls;

import java.util.Scanner;

public class Control1_ex1 {
	public static void main(String[] args) {
		//키보드로 부터 국어, 영어, 수학 점수 입력 받음
		//총점과 평균 계산
		//평균이 90점 이상이면 A 출력,80->B,70->C-,F그외 나머지
		
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
		if(avg>=90) {
			grade='A';
		}
		else if (avg<90 && avg>=80) {
			//System.out.println('B');
			grade='B';
		}
		else if (avg>=70) {
			//System.out.println('C');
			grade='C';
		}
//		else 
//			//System.out.println('F');
//			grade='F';
		
		System.out.println(grade);
	}

}
