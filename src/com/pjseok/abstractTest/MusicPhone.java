package com.pjseok.abstractTest;

public class MusicPhone extends Phone{
	String music;
	
	public void music() {
		System.out.println("음악듣기");
	}

	@Override
	public void bell(String bellName) {
		
		System.out.println("뮤직벨소리");
		
	}

	@Override
	public void turnOff() {
		//super.turnOff();
		System.out.println("2초간 버튼 홀드로 전원이 꺼짐");
	}
	
	// 전원을 끌 때 2초간 전원버튼을 눌러야 전원이 꺼짐
	// turnOff 메소드를 오버라이딩 하시오
	
	
	
}
