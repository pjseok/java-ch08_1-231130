package com.pjseok.ch10_2_exception;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		int a = 10;
		int [] arr = {1,2,3};
		
		
		
		try {
			int result = a / 0;
			
		} catch (Exception e) {
			System.out.println("모든 수는 0으로 나눌 수 없습니다");
			System.out.println(e);
		} 
		
		
		// Surround with - Try/catch block (블록지정 후 우클릭)  
		
		try {
			System.out.println(arr[7]);
		} catch (ArithmeticException e) {
			e.printStackTrace(); // 에러메시지 출력
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); // 에러메시지 출력
		} catch(Exception e) { // 모든 에러 catch
			e.printStackTrace(); // 에러메시지 출력
		} finally {
			System.out.println("에러의 발생여부와 상관없이 실행");
		}
	
	
		ThrowsTest throwTest = new ThrowsTest();
		// test 메소드에 throws 에러 떠넘기기가 선언되어 있으므로 test 메소드를 호출하는 측엣서 예최처리를 진행해야 함
		try {
			throwTest.test(0);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		String[] strArray = {"10", "2a"};
		int value = 0;
		for(int i=0;i<=2;i++){
			try {
				value = Integer.parseInt(strArray[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			}
			 catch(NumberFormatException e) {
				  System.out.println("숫자로 변환할 수 없음");
			  }finally {
				System.out.println(value);
			}
		}
	}
	
	}
	
	
	

