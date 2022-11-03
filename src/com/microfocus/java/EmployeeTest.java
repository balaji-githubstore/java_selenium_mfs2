package com.microfocus.java;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee.companyName="MicroFocus";
		
		Employee emp1=new Employee(101);
		emp1.setEmpId(101);
		emp1.empName="Saul";
		emp1.empSalary=8000;
		
		Employee emp2=new Employee(101,102.2);
		emp2.setEmpId(102);
		emp2.empName="Kim";
		emp2.empSalary=5000;
		
		Employee e3=new Employee();
		e3.setEmpId(103);
		e3.empName="wex";
		e3.empSalary=2000;
		
		Employee e4= Employee.getEmployeeInstance();
		
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		e3.displayEmployeeDetails();
		e4.displayEmployeeDetails();
		
		String name=Employee.getAuthorName();
		System.out.println(name);
		
		System.out.println(Employee.getAuthorName());
		
		
		
		

	}

}
