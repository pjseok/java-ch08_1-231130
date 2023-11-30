package com.pjseok.abstractTest;

public class CameraPhone extends Phone{
	
	String camera;
	
	public void photo() {
		System.out.println("사진 찍기");
	}

	@Override
	public void bell(String bellName) {
		// TODO Auto-generated method stub
		System.out.println("8비트 벨소리");
	}
	
	
}
