package com.iu.s3.array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive type - 숫자(정수형:byte, short,int,long | 실수형:float, double), 문자(char), 논리형(boolean)
		//reference type - 그외 나머지 ex)String
		
		double d1 =1.2;
		d1 = 5.3;
		//변수선언 공식 => 데이터타입 변수명;
		if(d1>0){
			int num =10;
		}
		
		//배열선언 공식 => 모으려고하는데이터타입 [] 변수명;
		double [] ar= new double[2]; // new -> 는 heap영역에 만든다는 것
		int [] ar2 = new int [3];
		
		System.out.println(d1);
		System.out.println(ar);
		ar[1]=5.2;
		
		System.out.println(ar[0]);
		System.out.println(ar2[0]);
		
		int [] ar3 = {1,2,3};
		int ar4[] = {2,3,4};
		
		for(int i=0;i<3;i++) {
			System.out.println(ar3[i]);
		}
		

	}

}
