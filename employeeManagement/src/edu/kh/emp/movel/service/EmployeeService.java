package edu.kh.emp.movel.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.kh.emp.movel.vo.Employee;

public class EmployeeService {
	
//	private Employee employee = new Employee();
	
	
	HashMap<Integer, Employee> empMap = new HashMap<>();

	
	
	
	
	

	public EmployeeService() {
		empMap.put(1111, new Employee(1111, "제니", "910101-1234567", "rkqrkq@gmail.com", "010-1234-5678", "마케팅", "대리", 300));
		empMap.put(2222, new Employee(2222, "지수", "930303-7542165", "wlt11n@gmail.com", "010-4512-8513", "개발", "부장", 270));
		empMap.put(3333, new Employee(3333, "로제", "911221-1245986", "fhdhwpdp@gmail.com", "010-8526-2378", "개발", "주임", 250));
		empMap.put(4444, new Employee(4444, "리사", "980105-3265874", "fltkdkdk@gmail.com", "010-2589-0026", "개발", "과장", 630));
		empMap.put(5555, new Employee(5555, "아이유", "970423-5689125", "dkdldb@gmail.com", "010-0147-0258", "마케팅", "부장", 770));
		empMap.put(6666, new Employee(6666, "수호", "970213-5645815", "tnghtngh@gmail.com", "010-4532-8520", "영업", "과장", 450));
		empMap.put(7777, new Employee(7777, "시우민", "901452-2569475", "tldnals@gmail.com", "010-6547-9630", "마메킹", "주임", 280));
		empMap.put(8888, new Employee(8888, "레이", "950123-8596415", "fpdl@gmail.com", "010-2547-1268", "영업", "대리", 250));
		empMap.put(9999, new Employee(9999, "백현", "890304-4125875", "qorgus@gmail.com", "010-9651-3105", "영업", "대리", 270));
		
	}
	

	

	/**
	 * 1. 새로운 사원 정보 추가
	 * 
	 * @param empId
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @return -1 : 이미 등록된 사원인 경우
	 * 			1 : 새로운 사원 추가 완료
	 */
	public int addNewEmpl(int empId, String empName, String empNo, String email, String phone, String departmentTitle,
			String jobName, int salary) {
		
		if(empMap.containsKey(empId)) return -1;
		else
			empMap.put(empId, new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary));
		return 1;

	}

	
	/**
	 * 2. 전체 사원 정보 조회
	 * @return 전체 사원 정보 조회
	 */
	public List<Employee> viewAllEmpl() {

		List<Employee> empList = new ArrayList<>();
		for(int i : empMap.keySet()) {
			empList.add(empMap.get(i));
		}
		return empList;
		
	}
	
	

	/**
	 * 3. 사번이 일치하는 사원 정보 조회
	 * @param empId
	 * @return empId와 일치하는 값의 Employee정보를 Employee형태로 전달
	 * 			일치하는 정보가 없으면 null반환
	 */
	public Employee viewOneEmpl(int empId) {
		return empMap.get(empId);
		
	}

	
	
	/**
	 * 4. 사번이 일치하는 사원 정보 수정
	 * @param empId
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @return empId와 일치하는 값의 Employee정보를 수정해 Employee형태로 전달
	 * 			일치하는 정보가 없으면 null반환
	 */
	public Employee editEmpl(int empId, String email, String phone, String departmentTitle, String jobName){
		if(!email.equals("")) empMap.get(empId).setEmail(email);
		if(!phone.equals("")) empMap.get(empId).setPhone(phone);
		if(!departmentTitle.equals("")) empMap.get(empId).setDepartmentTitle(departmentTitle);
		if(!jobName.equals("")) empMap.get(empId).setJobName(jobName);
		
		return empMap.get(empId);
	}

	
	/**
	 * 5. 사번이 일치하는 사원 정보 삭제
	 * @param empId
	 * @return 삭제한 사원의 이름 전달. View의 deleteEmpl메서드에서 사원 사번의 이름 검증이 완료된 상태로,
	 * 			map에 유효한 값이 전달됨.
	 */
	public String deleteEmpl(int empId) {
		String empName = empMap.get(empId).getEmpName();
		empMap.remove(empId);
		return empName;
		
	}

	/**
	 * 6. 입력 받은 부서와 일치 모든 사원 정보 조회
	 * @param departmentTitle
	 * @return 부서명과 일치하는 사원의 정보를 Employee list에 담아 전달.
	 */
	public List<Employee> viewDepartmentImpl(String departmentTitle) {
		
		List<Employee> empList = new ArrayList<>();
		
		for(int i : empMap.keySet()) {
			if(departmentTitle.equals(empMap.get(i).getDepartmentTitle()))
				empList.add(empMap.get(i));
		}
		
		return empList;
	}

	
	/**
	 * 7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 * @param salary
	 * @return 전달받은 급여 이상 받는 사원의 정보를 Employee list에 담아 전달.
	 */
	public List<Employee> viewImplBySalary(int salary) {
		
		List<Employee> empList = new ArrayList<>();
		
		for(int i : empMap.keySet()) {
			if(salary <=  empMap.get(i).getSalary())
				empList.add(empMap.get(i));
		}
		
		return empList;
		
	}




	public HashMap<String, Integer> viewSalaryByDepartment() {
		
		List<Employee> empList = new ArrayList<>();
		Set<String> departmentSet = new HashSet<>();
		HashMap<String, Integer> salaryMap = new HashMap<>();
		
		for(int i : empMap.keySet()) {
			departmentSet.add(empMap.get(i).getDepartmentTitle());
		}
		
		for(String s  : departmentSet) {
			int sum = 0;
			for(int i : empMap.keySet()) {
				if(s.equals(empMap.get(i).getDepartmentTitle())) {
					sum += empMap.get(i).getSalary();
				}
			}
			salaryMap.put(s, sum);
		}
		
		return salaryMap;
	}
	


}
