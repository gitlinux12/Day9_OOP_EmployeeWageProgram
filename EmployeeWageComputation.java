package com.employeewagecomputation;

public class EmployeeWageComputation {
	public final static int IS_PRESENT =1;
	
	public void attendance() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == IS_PRESENT)
			System.out.println("Employee is Present");
	
		else
		
			System.out.println("Employee is Absent");
	}
	public static void main(String[] args) {
		EmployeeWageComputation emp = new EmployeeWageComputation();
		emp.attendance();
		
	}
}

