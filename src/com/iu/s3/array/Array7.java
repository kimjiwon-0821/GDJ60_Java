package com.iu.s3.array;

import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		//1.데이터 추가 2.데어터삭제 3. 종료  - (0번인덱스)
		Scanner sc = new Scanner(System.in);
		int []arr = {5,1,4};
		boolean check = true;
		while(check) {
			System.out.println("1.데이터 추가 2.데어터삭제 3. 종료");
			int select = sc.nextInt();
			switch(select) {
//		1.데이터 추가
			case 1:
				System.out.println("추가할 데이터 : ");
				int num = sc.nextInt(); // 추가될 데이터 입력
				int[] copy1 = new int[arr.length+1];
				copy1[0]=num;
				for(int i=1;i<copy1.length;i++) {
					copy1[i]=arr[i-1];
				}//데이터 추가된 배열 저장
				arr=copy1;
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
				break;
		
//		2.데이터 삭제
			case 2:
				int [] copy2 = new int [arr.length-1];
				for(int i=0;i<copy2.length;i++) {
					copy2[i]=arr[i+1];
				}//데이터 삭제된 배열 저장
				arr=copy2;
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
				break;
		
//		3.종료
			case 3:
				System.out.println("프로그램 종료");
				check = false;
				break;
					
			}
		}
	}

}
