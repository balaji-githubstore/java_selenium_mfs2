package com.microfocus.java;

public class Demo1 {
	
	public static void main(String[] args) {
		
		int a=10;
		double b=10.2;
		String c="hello";
		Employee e=new Employee();
		
		
		Object z=c; //boxing
		
		int x= (int) z; //unboxing
		
		System.out.println(x);
		
		z=c;

		
		
		
	}

}
