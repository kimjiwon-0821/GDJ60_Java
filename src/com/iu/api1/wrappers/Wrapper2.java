package com.iu.api1.wrappers;

public class Wrapper2 {
	public static void main(String[] args) {
		int num = 10;
		
		//Auto-Boxing
		//primitive -> reference
		Integer num2 = num;  // 원래 : Integer num2 = new Integer(num2);
		
		//Auto-UnBoxing
		//reference -> primitive
		num = num2; // primitive 타입의 int와 reference 타입의 Integer에 서로 넣을 수 있다.
	}

}
