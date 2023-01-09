package com.iu.s3.array;

public class Array4 {
	public static void main(String[] args) {
		int [] ar1 = {1,2,3};
		//새로둔 배열 생성
		//깊은 복사
		int [] copy = new int[ar1.length+1];
		for(int i=0;i<ar1.length;i++) {
			copy[i]=ar1[i];
		}
		
		ar1 = copy; //얕은 복사
		
		copy[copy.length-1]=copy.length;
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]);
		}
	}

}
