package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {
	public static void main(String[] args) {
		//배그 
		//총알 30발 -> 1탄창
		//캐릭터당 -> 3탄창
		
		//1. 단발
		//2. 점사(3발씩 쏘는거)'
		
		//1번이면 "탕"*30번 출력
		//2번이면 "타타탕"*10번 출력
		//이후 다시 1,2번 반복을 3번
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("1.단발  2.점사");
			int select = sc.nextInt();
			int count = 10;
			String sound = "타타탕";
			if(select==1) {
//				for(int j=0;j<30;j++)
//				System.out.println("탕");
				sound="탕";
				count=30;
			}//단발 종료
//			else if (select==2) {
////				for (int j=0;j<10;j++)
////					System.out.println("타타탕");
//				sound= "타타탕";
//				count=10;
//			}//점사 종료
			for (int j=1;j<=count;j++)
				System.out.println(j+"번째 소리 : "+sound);
			
			if(i==2)
				break;
			System.out.println("재장전합니다.");
		}
		System.out.println("탄창을 모두 소진하였습니다.");
		
	}

}
