package com.iu.api2.token;

import java.util.StringTokenizer;

public class StringToken1 {
	public static void main(String[] args) {
		String nations = "Korea,서울,USA,워싱턴,UK,런던,Japan,도쿄";
		
		//하나하나 독립적인 데이터일때는 split
		String arr [] = nations.split(",");
		for(int i=0;i<arr.length;i++) {
			NationDTO nd = new NationDTO();
			nd.setName(arr[i]);
			nd.setCity(arr[++i]);
		}
		
		//데이터가 묶음이면 token이 편하다
		StringTokenizer st = new StringTokenizer(nations,",");
		while(st.hasMoreTokens()) { // hasMoreTokens -> 더이상 나눌 토큰이 있는가 True/False
			NationDTO nd = new NationDTO();
			String t1 = st.nextToken();
			nd.setName(t1);
			System.out.print(t1+" ");
			String t2 = st.nextToken();
			nd.setCity(t2);
			System.out.println(t2);
		}
		
	}

}
