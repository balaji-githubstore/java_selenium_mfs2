package com.microfocus.java;

public class Employee {

	private int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	
	public Employee()
	{
		System.out.println();
	}
	
	public Employee(int empId)
	{
		this.empId=empId;
		System.out.println();
	}

	public Employee(int no,double b)
	{
		System.out.println();
	}
	
	public Employee(double b,int no)
	{
		System.out.println();
	}
	
	
	// write
	public void setEmpId(int empId) {

		if (empId > 100) {

			this.empId = empId;
		} else {
			System.out.println("Invalid Employee Id");
		}
	}

	public void displayEmployeeDetails() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println("------------------");
	}

	public static String getAuthorName() {
		return "Balaji Dinakaran";
	}
	
	public static Employee getEmployeeInstance()
	{
		Employee e=new Employee();
		return e;
	}

}
