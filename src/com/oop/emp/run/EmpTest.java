package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

//실행용 메서드
public class EmpTest {
	public static void main(String[] args) {
		EmpTest et = new EmpTest();
		et.mainMenu();
	}
	
	public void mainMenu() {
		Employee e = new Employee(); //Employee e = null; = 초기화설정, 1을 입력받아 새로 만들 때  객체화
		input:
		for(;;) {
			
			System.out.println("****** 사원 정보 관리 프로그램 ******");
			System.out.println();
			System.out.println("1. 신규 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.println("****************************");
			
			//사용자 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.print(">>");
			int inputInt=sc.nextInt();
			
			//입력값에 따라 메서드 실행
			switch(inputInt) {
			case 1:
				//e = new Employee();
				e.empInput();
				break;
			case 2:
				this.modifyMenu(e);
				break;
			case 3:
				e = new Employee();//e = null;
				break;
			case 4:
				if(e==null) {
					System.out.println("먼저 사원 정보를 입력하세요.");
					break;
				}
				e.empOutput();
				break;
			case 9:
				System.out.println("종료합니다.");
				break input;
			default:
				System.out.println("잘못된 입력입니다.");
			}	
		}
	}
	
	private void modifyMenu(Employee e) {
		//e의 null여부 확인
		if(e==null) {
			System.out.println("먼저 사원 정보를 입력하세요.");
			return;
		}
		
		for(;;) {
			System.out.println("****** 사원 정보 수정 메뉴 ******");
			System.out.println();
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("5. 이전 메뉴로 이동");
			System.out.println("**************************");
			
			Scanner sc = new Scanner(System.in);
			System.out.print(">>");
			int inputInt = sc.nextInt();
			
			switch(inputInt) {
			case 1:
				System.out.print("변경할 이름을 입력하세요 : ");
				String chName = sc.next();
				e.setEmpName(chName);
				break;
			case 2:
				System.out.print("변경할 급여를 입력하세요 : ");
				int chSalary = sc.nextInt();
				e.setSalary(chSalary);
				break;
			case 3:
				System.out.print("변경할 부서를 입력하세요 : ");
				String chDept = sc.next();
				e.setDept(chDept);
				break;
			case 4:
				System.out.print("변경할 직급을 입력하세요 : ");
				String chJob = sc.next();
				e.setJob(chJob);
				break;
			case 5:
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			
		}
		
	}
}
