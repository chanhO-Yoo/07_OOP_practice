package com.oop.employee.model.vo;

public class Employee {
	//필드
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonusPct;
	
	//기본생성자
	public Employee() {
		
	}
	//인자(파라미터)가 4개인 생성자
	public Employee(int empNo, String name, char gender, String phone) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	//인자(파라미터)가 7개인 생성자
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonusPct) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.dept = dept;
		this.salary = salary;
		this.bonusPct = bonusPct;
	}
	
	//setter method
	public void setEmpno(int empNo) {
		this.empNo = empNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setBonusPct(double bonusPct) {
		this.bonusPct = bonusPct;
	}
	
	//getter method
	public int getEmpNo() {
		return empNo;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getDept() {
		return dept;
	}
	public int getSalary() {
		return salary;
	}
	public double getBonusPct() {
		return bonusPct;
	}
	
	//출력 메서드
	public void printEmployee() {
		System.out.println(empNo+", "+name+", "+gender+", "+phone+", "+dept+", "+salary+", "+bonusPct);
	}
}
