package com.iu.s2.loops;

public class LoopFor1_ex1 {
	public static void main(String[] args) {
		System.out.println("Start");
		
		//0-100미만 사이의 짝수만 출력하세요
//		int sum=0;
//		for(int i=0;i<100;i++) {
//			if(i%2==0) {
//				sum+=i;
//				System.out.println(i);
//			}
//		}
//		System.out.println(sum);
		
		
		//0-100미만 짝수 출력 if문 없이
//		for(int i=0;i<100;i+=2) {
//			System.out.println(i);
//		}	
		
		
		//if문 없이 swich문 사용 - 자습 실습
//		for(int i=0;i<100;i++) {
//			switch(i%2) {
//			case 0: System.out.println(i); break;
//			case 1: break;
//			}
//		}
		
		
		//0-100미만의 합계를 구하세요.
		int sum=0;
		for(int i=0;i<100;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		
		System.out.println("Finish");
	}

}
