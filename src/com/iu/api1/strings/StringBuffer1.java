package com.iu.api1.strings;

public class StringBuffer1 {
	public static void main(String[] args) {
		//StringBuffer은 String이 아님
		StringBuffer sb = new StringBuffer("Hello"); // hello
		
		//hello +world
		sb.append("world");
		System.out.println(sb); //왜 주소가 안나오고 helloworld가 나오나요
		//참조변수를 출력하면 object의 toString메소드가 자동 호출된다. -> toString:클래스명@객체주소 가 리터뇌는 메소드
		//StringBuffer에서 toString을 오버라이딩 했다.
		
		//변수에는 같은 데이터타입만 대입 가능
		//String str = sb; -> str : String  / sb:StirngBuffer -> 다른타입이기 때문에 대입이 불가능
		//접근 지정자 : public,protected,default,private
		
		String str = sb.substring(0); // stringBuffer로 가져온 것을 문자열로 변경
		str= sb.toString();
		//오버라이딩되었기때문에 toString도 가능
		System.out.println(str);
		
		sb.reverse();
		System.out.println(sb);
		
		String.valueOf(123); // 클래스메소드이므로 클래스.메소드명 -> valueof 매개변수를 string으로 변경하는 메소드
		System.out.println(str);
		
		str = 123+""; // primitive와 reference 타입이 더하면 reference 타입으로 변경된다.                     
		
				
		
		
	}

}
