package com.field.result;

public class Test {
	int a = 100;
	static int s = 99;
	
	public static void main(String[] args) {
		Test t = new Test();
		t.test1(); //예상값 : 1000 / 99
				   //결과값 : 100 / 99
		
		t.test2(); //예상값 : 100
				   //결과값 : 100
		
		Test t3 = new Test();
		t.test3(t3);//예상값 : 10
					//결과값 : 10
		
		System.out.println(t3.a); //예상값 : 200
								  //결과값 : 10
		
		t.test4(t); //예상값 : 1000
					//결과값 : 1000
	}
	
	public void test1() {
		int a = 1000;
		int s = 999;
		System.out.println("test1 = "+this.a);
		System.out.println("test1 = "+Test.s);
	}
	
	public void test2() {
		Test t = new Test();
		t.a = 1000;
		System.out.println("test2 = "+a);
	}
	
	public void test3(Test t) {
		t.a = 10;//t3.a = 10
		this.a = 200; //a = 200
		System.out.println("test3 = "+t.a);
	}
	
	public void test4(Test t) {
		t.a = 1000; //a=1000
		System.out.println("test4 = "+this.a);
	}

}
