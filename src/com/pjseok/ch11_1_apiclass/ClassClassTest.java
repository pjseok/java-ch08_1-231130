package com.pjseok.ch11_1_apiclass;

import com.pjseok.abstractTest.CameraPhone;
import com.pjseok.abstractTest.Phone;

public class ClassClassTest {

	public static void main(String[] args) {
		
		Class clazz = String.class;
		
		Class phoneClass1 = Phone.class; // Phone 클래스의 정보를 가져와서 저장
		
		try {
			Class phoneClass2 = Class.forName("com.pjseok.abstractTest.Phone"); // 자바 입장에서 문자열을 못 믿어서 (없거나, 오타발생) 예외처리를 해라.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Phone phone = new CameraPhone();
		
		Class phoneClass3 = phone.getClass();

	
		System.out.println(phoneClass1.getName());
		
		
		String str = "홍길동"; // str -> String으로 만든 객체(일반 변수가 아님)
		
		String str2 = new String("김유신");		
		System.out.println(str2);
		
	
	
	
	
	
	
	
	}
	
		




}
