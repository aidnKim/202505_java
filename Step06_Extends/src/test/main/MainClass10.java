package test.main;

import test.company.Department;
import test.company.Employee;

public class MainClass10 {
	public static void main(String[] args) {
		
		Department d1 = new Department("영업부", "대전");
		/*
		 * 위의 부서에서 근무하는 사원(Employee) 객체 3개를 만들어서
		 * 그 참조값 3개를 배열에 순서대로 담아보세요.
		 */
		Employee e1 = new Employee("이름1", 1000, d1);
		Employee e2 = new Employee("이름2", 2000, d1);
		Employee e3 = new Employee("이름3", 3000, d1);
		
		Employee[] emps = {e1, e2, e3};
		
		// for문 이용해서 Emploee[] 에 담긴 Employee 객체의 
		// .printInfo() 메소드를 순서대로 호출하기
		for(int i=0; i<emps.length; i++) {
			// i번째 방에 있는 Employee 객체의 참조값 얻어내기
			Employee tmp=emps[i];
			//메소드 호출
			tmp.printInfo();
		}
		System.out.println("--------------");
		
		for(Employee tmp : emps) {
			tmp.printInfo();
		}
	}
}
