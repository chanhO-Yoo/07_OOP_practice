package com.oop.method.nonstatic;

import java.util.Arrays;
import java.util.Random;

public class NonStaticSample {
	public NonStaticSample() {}
	
	//1.반환값 없고 매개변수 없는 메서드
	//실행 요청시 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력
	//메서드명 : printLottoNumbers
	
	public void printLottoNumbers() {
		Random rnd = new Random();
		int[] lottoNumber = new int[6];
		
		for(int i=0;i<lottoNumber.length;i++) {
			int inputNumber = rnd.nextInt(45)+1;
			lottoNumber[i] = inputNumber;
			for(int j=0;j<i;j++) {
				if(lottoNumber[j]==lottoNumber[i]) {
					i--;
				}
			}	
		}
		System.out.println(Arrays.toString(lottoNumber));
	}
	
	//2. 반환값 없고 매개변수 있는 메서드
	//실행 요청시 정수 하나, 문자하나를 전달받아 문자를 정수 갯수만큼 출력하는 메서드
	//메소드명 : outputChar
	public void outputChar(int i, char ch) {
		String str = "";
		for(int count=0;count<i;count++) {
			str += ch;
		}
		System.out.println(str);
	}
	
	//3. 반환값 있고 매개변수 없는 메서드
	//실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메서드
	//메서드명 : alphabet
	public char alphabet() {

		//소문자 a-z배열에 삽입
		char a = 'a';
		char[] alphabet = new char[52];
		for(int i=0;i<26;i++) {
			alphabet[i] = a;
			a++;
		}
		//대문자 A-Z배열에 삽입
		char b ='A';
		for(int i=26;i<52;i++) {
			alphabet[i] = b;
			b++;
		}
		//0~51사이의 임의수 하나 선택 후 해당 인덱스의 알파벳 출력
		Random rnd = new Random();
		int choice = rnd.nextInt(52)+1;
		char ch = alphabet[choice-1];
		return ch;
	}
	
	//4. 반환값 있고 매개변수 있는 메서드
	//실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아
	//해당 인덱스 범위의 문자열을 추출하여 리턴하는 메서드
	//단, 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
	//메서드명 : mySubstring
	public String mySubstring(String str, int startIndex, int endIndex) {
		if(str == null) {
			return null;
		}
		if(endIndex>str.length()||startIndex<1) {
			System.out.println("잘못된 입력입니다.");
			return null;
		}
		char[] ch = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i] = str.charAt(i);			
		}
		String result="";
		
		for(int i=startIndex-1;i<endIndex;i++) {
			result += ch[i];
		}
		return result;
	}
}
