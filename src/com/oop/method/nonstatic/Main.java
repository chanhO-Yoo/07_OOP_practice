package com.oop.method.nonstatic;

public class Main {

	public static void main(String[] args) {		
		NonStaticSample nss = new NonStaticSample();
		
		nss.printLottoNumbers();
		System.out.println("========================");
		nss.outputChar(3, 'a');
		System.out.println("========================");
		System.out.println(nss.alphabet());
		System.out.println("========================");
		System.out.println(nss.mySubstring("Hello",3,5));
	}

}
