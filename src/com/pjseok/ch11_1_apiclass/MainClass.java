package com.pjseok.ch11_1_apiclass;

import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = new Object();
		
		object = "korea";
		object = 100;
		
		// object 모든 클래스의 조상
		
		String a = "korea";
		
		Object object2 = new Object();
		
		
		System.out.println(a.toString());
		System.out.println(object.toString());
		
		Date object3 = new Date();
		
		String ob3 = object3.toString(); // 객체의 정보를 문자열로 반환
		
		System.out.println(object2.toString()); // toString: 객체의 정보를 문자열로 바꿔서 반환
	
		System.out.println(object3.toString());
	
		
	
	}

}
