package edu.kh.emp.view;


import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.emp.movel.service.EmployeeService;
import edu.kh.emp.movel.vo.Employee;

public class EmployeeView {
	
	private Scanner sc = new Scanner(System.in);
	private boolean flag = true;
	private EmployeeService service = new EmployeeService();

	public void employeeView() {
		
		
		while(flag) {
			try {
		
				System.out.println("==============[ 사원 서비스 선택 ]==============");
			
				System.out.println("1. 새로운 사원 정보 추가");
				System.out.println("2. 전체 사원 정보 조회");
				System.out.println("3. 사번이 일치하는 사원 정보 조회");
				System.out.println("4. 사번이 일치하는 사원 정보 수정");
				System.out.println("5. 사번이 일치하는 사원 정보 삭제");
				System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
				System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
				System.out.println("8. 부서별 급여 합 전체 조회");
				System.out.println("0. 프로그램 종료");
				System.out.println();
				
				System.out.print("번호 선택 >> ");
				int input = -1;
				input = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				
				switch(input) {
				
					case 1 : //새로운 사원 정보 추가
						addNewEmpl();
						break;
						
					case 2 : //전체 사원 정보 조회
						viewAllEmpl();
						break;
						
					case 3 : // 사번이 일치하는 사원 정보 조회
						viewOneEmpl();
						break;
						
					case 4 : // 사번이 일치하는 사원 정보 수정
						editEmpl();
						break;
						
					case 5 : // 사번이 일치하는 사원 정보 삭제
						deleteEmpl();
						break;
						
					case 6 : // 입력 받은 부서와 일치 모든 사원 정보 조회
						viewDepartmentImpl();
						break;
						
					case 7 : // 입력 받은 급여 이상을 받는 모든 사원 정보 조회
						viewImplBySalary();
						break;
						
					case 8 : // 부서별 급여 합 전체 조회
						viewSalaryByDepartment();
						break;
						
					case 0 : // 프로그램 종료
						System.out.println("==============[ 프로그램 종료 ]==============");
						flag = false;
						break;
						
					default : 
						System.out.println("잘못 입력하셨습니다.");
				}
			} catch(InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 숫자만 입력해주세요");
				e.printStackTrace();
			}
		}
		
	}






	/**
	 * 1. 새로운 사원 정보 추가
	 */
	public void addNewEmpl() {
		System.out.println("[[ 새로운 사원 정보 추가 ]]\n");
		System.out.print("사원 번호(사번) 입력 : ");
		int empId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사원 이름 입력 : ");
		String empName = sc.nextLine();
		
		System.out.print("사원 주민등록번호 입력 : ");
		String empNo = sc.nextLine();
		
		System.out.print("사원 이메일 입력 : ");
		String email = sc.nextLine();
		
		System.out.print("사원 전화번호 입력 : ");
		String phone = sc.nextLine();
		
		System.out.print("사원 부서명 입력 : ");
		String departmentTitle = sc.nextLine();
		
		System.out.print("사원 직급명 입력 : ");
		String jobName = sc.nextLine();
		
		System.out.print("사원 급여 입력 : ");
		int salary = sc.nextInt();
		
		int result = service.addNewEmpl(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
		if(result == -1)
			System.out.println("기존의 사원정보와 일치합니다. 다시 입력해주세요");
		else
			System.out.println("\n[신규 사원 추가 완료]\n");
	}
	
	
	/**
	 * 2. 전체 사원 정보 조회
	 * 
	 * 등록된 사원이 0명일 경우 출력값 반환, 있을 경우 list에 저장된 값 출력
	 */
	public void viewAllEmpl() {
		System.out.println("[[ 새로운 사원 정보 추가 ]]\n");
		List<Employee> empList = service.viewAllEmpl();
		
		if(empList.size() == 0)
			System.out.println("등록된 사원이 아무도 없습니다.\n");
		else
			for(Employee emp : empList) 
				System.out.println(emp.toString());
		System.out.println();	
	}
	
	/**
	 * 3. 사번이 일치하는 사원 정보 조회
	 */
	public void viewOneEmpl() {
		System.out.println("[[ 사번이 일치하는 사원 정보 조회 ]]\n");
		System.out.print("사원 번호(사번) 입력 : ");
		int empId = sc.nextInt();
		sc.nextLine();
		
		Employee result = service.viewOneEmpl(empId);
		if(result == null)
			System.out.println("일치하는 사원이 없습니다.");
		else
			System.out.println(result);
		
		System.out.println();
		System.out.println();
		
	}
	
	/**
	 * 4. 사번이 일치하는 사원 정보 수정
	 */
	public void editEmpl() {
		System.out.println("[[ 사번이 일치하는 사원 정보 수정 ]]\n");
		System.out.print("사원 번호(사번) 입력 : ");
		int empId = sc.nextInt();
		sc.nextLine();
		
		if(service.viewOneEmpl(empId) != null) {
			
			

			

			String email = ""; 
			String phone = ""; 
			String departmentTitle = ""; 
			String jobName = "";
			
			
			boolean flagEdit = true;
			while(flagEdit) {
				
				System.out.println("변경할 사원의 정보를 입력하세요 : ");
				System.out.println("1. 이메일 || 2. 전화번호 || 3. 부서명 || 4. 직급명  || 0. 변경 완료, 종료");
				System.out.println();

				System.out.print("번호 선택 >>");
				int num = sc.nextInt();
				sc.nextLine();

				
				switch(num) {
					case 1 :
					System.out.print("사원 이메일 입력 : ");
					email = sc.nextLine();
//					service.editEmplEmail(empId, email);
					break;
					
					case 2: 
					System.out.print("사원 전화번호 입력 : ");
					phone = sc.nextLine();
//					service.editEmplPhone(empId, phone);
					break;
					
					case 3:
					System.out.print("사원 부서명 입력 : ");
					departmentTitle = sc.nextLine();
//					service.editEmplDepartmentTitle(empId, departmentTitle);
					break;
					
					case 4 :
					System.out.print("사원 직급명 입력 : ");
					jobName = sc.nextLine();
//					service.editEmplJobName(empId, jobName);
					break;
					
					case 0 :
						flagEdit =  false;
						System.out.println(">> 사원 정보 변경 완료\n");
						break;
						
					default :
						System.out.println("잘못 입력하셨습니다.");
				
				}
			}
			System.out.println("[변경된 사원정보 출력]");
			System.out.println(service.editEmpl(empId, email, phone, departmentTitle, jobName));
			System.out.println("\n");
		} else
			System.out.println("변경하고자 하는 사원의 정보가 없습니다.\n");
	}
	
	/**
	 * 5. 사번이 일치하는 사원 정보 삭제
	 */
	public void deleteEmpl() {
		System.out.println("[[ 사번이 일치하는 사원 정보 삭제 ]]\n");
		System.out.print("사원 번호(사번) 입력 : ");
		int empId = sc.nextInt();
		sc.nextLine();
		
		if(service.viewOneEmpl(empId) != null) {
			System.out.println(service.deleteEmpl(empId) + " 사원의 정보가 삭제되었습니다.\n");
			

			

			
		} else
			System.out.println("변경하고자 하는 사원의 정보가 없습니다.");
		
	}
	
	/**
	 * 6. 입력 받은 부서와 일치 모든 사원 정보 조회
	 */
	public void viewDepartmentImpl() {
		System.out.println("[[ 입력 받은 부서와 일치 모든 사원 정보 조회 ]]\n");
		System.out.print("부서명 입력 : ");
		String departmentTitle = sc.nextLine();
		
		List<Employee> empList = service.viewDepartmentImpl(departmentTitle);
		if(empList.size() != 0) {
			for(Employee empl : empList)
				System.out.println(empl);
		} else
			System.out.println("부서명이 정확하지 않습니다.");
		System.out.println();
		
	}
	
	/**
	 * 7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 */
	public void viewImplBySalary() {
		System.out.println("[[ 입력 받은 급여 이상을 받는 모든 사원 정보 조회 ]]\n");
		System.out.print("급여 입력 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		
		List<Employee> empList = service.viewImplBySalary(salary);
		
		if(empList.size() != 0) {
			for(Employee empl : empList)
				System.out.println(empl);
		} else
			System.out.println("해당하는 사원이 아무도 없습니다.");
		System.out.println();
	}
	
	
	/**
	 * 8. 부서별 급여 합 전체 조회
	 */
	private void viewSalaryByDepartment() {
		System.out.println("[[ 부서별 급여 합 전체 조회 ]]\n");
		
		HashMap<String, Integer> salaryMap = service.viewSalaryByDepartment();
		
		if(salaryMap.size() != 0) {
			for(String s : salaryMap.keySet())
				System.out.printf("%s부서 급여 합 : %d(만원)\n", s, salaryMap.get(s));
		} else
			System.out.println("사원이 DB에 아무도 없습니다.");
		System.out.println();
	}

}
