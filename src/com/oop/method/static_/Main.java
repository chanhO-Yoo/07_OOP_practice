package com.oop.method.static_;

import com.oop.method.static_.StaticMethod;

public class Main {

	public static void main(String[] args) {
		StaticMethod.toUpper();
		
		StaticMethod.setChar(3, 'a');
		
		System.out.println(StaticMethod.valueLength());
		
		System.out.println(StaticMethod.valueConcat("Hi eclipse!"));
	}

}
