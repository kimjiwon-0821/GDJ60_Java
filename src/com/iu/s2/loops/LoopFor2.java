package com.iu.s2.loops;

public class LoopFor2 {
	public static void main(String[] args) {
		//반복문의 보조문
		//1. break;
		//반복문내에서 break;를 만나면 그 즉시 해당 반복문을 종료
		for (int i=0;i<10;i++) {
			System.out.println(i);
			if(i%4==3)
				break;
		}
		System.out.println("반복문 종료");
		
		//2. continue;
		//반복분내에서 continue;를 만나면 메인 반복문의 수행중인 실행문을 종료(그 즉시 증감식으로 이동)
		// 1) for문   : 그 즉시 증감식으로 이동
		// 2) while문 : 그 즉시 조건식으로 이동
		for (int i=0;i<10;i++) {
		
			if(i%2==0)
				continue;
			System.out.println(i);
		}
		System.out.println("반복문 종료");
	}

}
