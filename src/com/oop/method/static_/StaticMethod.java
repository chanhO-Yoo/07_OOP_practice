package com.oop.method.static_;

import java.util.Arrays;

public class StaticMethod {
	//Field
	private static String value;

	//Constructor : 필드 모두가 static일 경우 생성자 필요 없음.
//	public StaticMethod() {}
//	
//	public StaticMethod(String value) {
//		this.value = value;
//	}
	
	//필드가 모두 static인 경우 메서드도 전부 static이어야 한다.
	//static method
	//1.반환값 없고 매개변수 없는 메서드
	//value 필드 값을 모두 대문자로 바꾸는 static 메서드
	//메서드명 : toUpper
	
	public static void toUpper() {
		value = "hello";
		String result = value.toUpperCase();
		value = result;
		System.out.println(value);
	}
	
	//2.반환값 없고 매개변수 있는 메서드
	//인덱스와 문자를 전달받아
	//value 필드에서 전달받은 인덱스 위치의 값을 전달받은 문자로
	//변경하는 static 메서드
	public static void setChar(int index,char ch) {
		value = "hello";
		char[] arr = new char[value.length()];
		for(int i=0;i<value.length();i++) {
			arr[i]=value.charAt(i);
		}
		arr[index] = ch;
		String result="";
		for(int i=0;i<arr.length;i++) {
			result += arr[i];
		}
		value = result;
		System.out.println(value);
	}
	
	//3. 반환값 있고 매개변수 없는 static 메서드
	//value필드에 기록된 글자 갯수 리턴 처리
	//메서드명 : valueLength
	
	public static int valueLength() {
		value = "hello world";
		int count=value.length();
		return count;
	}
	
	//4. 반환값 있고 매개변수 있는 static 메서드
	//문자열 값을 전달받아, value 필드값과 하나로 합쳐서 리턴 처리
	//메서드명 : valueConcat
	public static String valueConcat(String str) { 
		value = "hello world.";
		String result = value + str;
		return result;
	}
}
