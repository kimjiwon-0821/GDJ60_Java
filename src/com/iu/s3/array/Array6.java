package com.iu.s3.array;

import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) {
		int [] ar1 = {8,5,13,9,6};
		int [] copy = new int[ar1.length-1];
		
		//키보드로부터 삭제하고 싶은 값을 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		int idx=0;
		for(int i=0;i<ar1.length;i++) {
			if(ar1[i]==num) {
				continue;
				}
				copy[idx] = ar1[i]; 
				idx++;
		}//깊은 복사
//		int j=0;
//		for(int i=0;i<copy.length;i++) {
//			if(ar1[i]==num) {
//				j=1;
//			}
//			if(j==1) {
//				copy[i]=ar1[i+1];
//			}
//			else
//				copy[i] = ar1[i];
//		}//깊은 복사
		
		ar1=copy;
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
		}
			
	}

}
