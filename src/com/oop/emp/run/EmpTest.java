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
		Employee e = new Employee();
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
				e.empInput();
				break;
			case 2:
				this.modifyMenu(e);
				break;
			case 3:
				e = new Employee();
				break;
			case 4:
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
	
	public void modifyMenu(Employee e) {
		Employee emp = new Employee();
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
			int inputInt = sc.nextInt();
			
			switch(inputInt) {
			case 1:
				System.out.print("변경할 이름을 입력하세요 : ");
				String chName = sc.next();
				emp.setEmpName(chName);
				break;
			case 2:
				System.out.print("변경할 급여를 입력하세요 : ");
				int chSalary = sc.nextInt();
				emp.setSalary(chSalary);
				break;
			case 3:
				System.out.print("변경할 부서를 입력하세요 : ");
				String chDept = sc.next();
				emp.setDept(chDept);
				break;
			case 4:
				System.out.print("변경할 직급을 입력하세요 : ");
				String chJob = sc.next();
				emp.setJob(chJob);
				break;
			case 5:
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			
		}
		
	}
}
