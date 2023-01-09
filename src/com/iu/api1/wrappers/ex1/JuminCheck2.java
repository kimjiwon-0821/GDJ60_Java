package com.iu.api1.wrappers.ex1;

public class JuminCheck2 {
	//check
	//주민등록번호를 받아서
	//주민번호가 진짜인지 가짜인지 판별
	//맨끝자리 제외(체크용)
	//나머지값을 11로 뺀 결과값하고 체크용 번호랑 같은지 확인
	//11로 뺀 결과값이 두자리면 결과값을 다시 10으로 나눈 나머지를 체크용 번호랑 같은지 확인 
	//10/10 = 몫:1, 나머지:0  --> 0과 체크용 번호가 같은지 확인
	
	public void check(String jumin) {
		String c = jumin.substring(13);
		int check = Integer.parseInt(c);
		int num=2;
		int sum =0;
		for(int i=0;i<=jumin.length()-1;i++) {
			if(i==6)
				continue;
			int n=Integer.parseInt(jumin.substring(i,i+1)/*String.valueOf(jumin.charAt(i)*/);
			sum += (n*num);
			num++;
			if(num==10)
				num=2;
		}
		
		int result = 11- sum%11;
		if(result>9) {
			result = result%10;
		}
		if(result==check) {
			System.out.println("정상 주민등록번호입니다.");
		}
		else 
			System.out.println("비정상 주민등록번호입니다.");
	}

}
