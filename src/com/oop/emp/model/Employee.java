package com.oop.emp.model;

import java.util.Scanner;

//사원 정보 관리용 클래스
public class Employee {
	
	//필드 변수는 캡슐화(private)적용
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	//메서드(public)를 통해  private인 변수에 접근
	//입력용 메서드
	public void empInput() {
		System.out.println("=========================");
		Scanner sc = new Scanner(System.in);
		System.out.print("사번을 입력하세요 : ");
		empNo = sc.nextInt();
		System.out.print("이름을 입력하세요 : ");
		empName = sc.next();
		System.out.print("소속 부서를 입력하세요 : ");
		dept = sc.next();
		System.out.print("직급을 입력하세요 : ");
		job = sc.next();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("성별을 입력하세요 : ");
		gender = sc.next().charAt(0);
		System.out.print("급여를 입력하세요 : ");
		salary = sc.nextInt();
		System.out.print("보너스 포인트를 입력하세요 : ");
		bonusPoint = sc.nextDouble();
		System.out.print("핸드폰번호를 입력하세요 : ");
		phone = sc.next();
		System.out.print("주소를 입력하세요 : ");
		address = sc.next();
		System.out.println("=========================");
	}
	//출력용 메서드
	public void empOutput() {
		//this : 현재 객체를 가리키는 메소드의 숨은 참조
		//this.empNo이 객체의 필드변수 를 가르킨다
		//지역변수와 구분하기 위해서 사용
		//별도의 지역변수가 없다면 사용할 필요는 없다.
		System.out.println("사번 : "+empNo);
		System.out.println("이름 : "+empName);
		System.out.println("소속부서 : "+dept);
		System.out.println("직급 : "+job);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender);
		System.out.println("급여 : "+salary);
		System.out.println("보너스포인트 : "+bonusPoint);
		System.out.println("핸드폰 : "+phone);
		System.out.println("주소 : "+address);
	}
	//setter 메서드
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//getter 메서드
	public int getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDept() {
		return dept;
	}
	public String getJob() {
		return job;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
}
