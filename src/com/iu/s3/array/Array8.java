package com.iu.s3.array;

public class Array8 {
	public static void main(String[] args) {
		int [] arr = {9,5,8,3,6};
		int temp;
		//2중 for문 돌리기
		//9,8,6,5,3 =>내림차순
		//3,5,6,8,9 =>오름차순
		//0 : 1,2,3,4
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println(" ");
		System.out.println("=내림차순==");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println(" ");
		System.out.println("=올림차순=");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}

}
