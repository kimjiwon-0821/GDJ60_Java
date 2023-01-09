package com.iu.api1.wrappers;

public class Wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.BYTES);//바이트크기
		System.out.println(Long.BYTES);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE); // 비트
		//Integer.BYTES=34; -> 불가능 final class 변수로 상수이기 대문에
		
		String n1 = "12";
		Integer int1 = new Integer(n1);
		int num1 = Integer.parseInt(n1);
		System.out.println(num1);
		
		n1 = "15.345";
		double num2 = Double.parseDouble(n1);
		System.out.println(num2);
	}

}
