package com.greatlearning.services;

import com.greatlearning.models.*;

public class DepartmentFunctions {

	public static void display(AdminDepartment emp) {
		System.out.println("Welcome to " + emp.departmentName());
		System.out.println(emp.getTodaysWork());
		System.out.println(emp.getWorkDeadline());
		System.out.println(emp.isTodayAHoliday());
	}
	
	public static void display(HRDepartment emp) {
		System.out.println("Welcome to " + emp.departmentName());
		System.out.println(emp.doActivity());
		System.out.println(emp.getTodaysWork());
		System.out.println(emp.getWorkDeadline());
		System.out.println(emp.isTodayAHoliday());
	}
	
	public static void display(TechDepartment emp) {
		System.out.println("Welcome to " + emp.departmentName());
		System.out.println(emp.getTodaysWork());
		System.out.println(emp.getWorkDeadline());
		System.out.println(emp.getTechStackInformation());
		System.out.println(emp.isTodayAHoliday());
	}
}
