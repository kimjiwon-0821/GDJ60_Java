package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min=sc.nextInt();
		int sec= sc.nextInt();
		int b;
		int s;
		
		for(b=0;b<60;b++) {
			for (s=0;s<60;s++) {
				System.out.println(b+"문"+s+"초");
				if(min==b&&sec==s) {
						break;
				}//초 break;
			}//for2 끝
			
			if(min==b &&sec==s) {
				break;
			}//분 break;
		}//for1 끝
		
		System.out.println("프로그램 종료");
	}

}
