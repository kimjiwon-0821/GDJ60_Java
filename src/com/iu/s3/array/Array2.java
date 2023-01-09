package com.iu.s3.array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		int [] ar = new int[3];
		int [] ar2 = new int [2]; //배열의 크기를 명시해줘야 함.
		//키보드로부터 숫자를 입력 받아서 해당 숫자만큼 배열의크기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		int [] ar3 = new int[num];
		for(int i=0;i<ar3.length;i++) {
			System.out.print(i+ "인덱스의 값을 입력하세요 : ");
			ar3[i]=sc.nextInt();
		}
		for (int i=0;i<num;i++) {
			System.out.print(ar3[i]);
			System.out.print(" ");
		}
		
		System.out.println(ar[4]); // overflow 예외처리 필요
		
	}

}
