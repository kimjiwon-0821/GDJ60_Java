package com.iu.s3.array;

import java.util.Scanner;

public class Array_ex1 {
	public static void main(String[] args) {
		//1. 학생수 입력
		//2. 학생수 만큼의 이름을 입력 ->a,b
		//3. 학생수 만큼 학생의 번호, 국어, 영어, 수학 입력 따로따로 배열
		// -> a 학생의 번호: 입력
		// -> a 학생의 국어 : 입력 ....
		//4. 모든 학생의 정보 출력
		// -> 이르 ㅁ번호 국어 영어 수학  총점 평균
		// ->  a  4  45  34  56
		//자동으로 총점과 평균 계산하는 배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		int num = sc.nextInt();
		String [] arname = new String[num];//학생 이름
		int [] arnum = new int[arname.length];
		int [] arkor = new int[arname.length];
		int [] areng = new int[arname.length];
		int [] armath = new int [arname.length];
		int [] artotal = new int[arname.length];
		double [] aravg = new double [arname.length];
		
		for(int i=0;i<arname.length;i++) {
			System.out.print((i+1)+"번째 학생의 이름을 입력하세요 : ");
			arname[i] = sc.next();
		}//이름 입력
		
		for(int i=0;i<arname.length;i++) {
			System.out.println(arname[i]+" 학생의 정보를 입력하세요.");
			System.out.print(arname[i]+" 학생의 번호: ");
			arnum[i] = sc.nextInt();
			System.out.print(arname[i]+" 학생의 국어: ");
			arkor[i] = sc.nextInt();
			System.out.print(arname[i]+" 학생의 영어: ");
			areng[i] = sc.nextInt();
			System.out.print(arname[i]+" 학생의 수학: ");
			armath[i] = sc.nextInt();
			artotal[i]=arkor[i]+areng[i]+armath[i];
			aravg[i]=(double)artotal[i]/3;
		}//성적 입력
		
		System.out.println("이름\t번호 \t국어 \t영어 \t수학 \t총점 \t평균");
		for (int i=0;i<arname.length;i++) {
			System.out.println(arname[i]+"\t"+arnum[i]+"\t"+arkor[i]+"\t"+areng[i]+"\t"+armath[i]+"\t"+artotal[i]+"\t"+aravg[i]);
		}
		
	}

}
