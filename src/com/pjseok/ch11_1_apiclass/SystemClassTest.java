package com.pjseok.ch11_1_apiclass;

public class SystemClassTest {

	public static void main(String[] args) {
		
		long time1 = System.currentTimeMillis(); // 현재시간을 밀리세컨드 단위로 반환
		
		System.out.println(time1);
		
		long time2 = System.nanoTime();
		
		//System.out.println(time2);
		
		
		System.out.println("프로그램 시작");
		
		//System.exit(0); // 프로그램 강제 종료
		
		System.out.println("프로그램 종료");
		
		
	
	
	}

}
