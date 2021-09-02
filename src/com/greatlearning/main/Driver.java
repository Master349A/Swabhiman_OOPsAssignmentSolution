package com.greatlearning.main;

import com.greatlearning.models.*;
import com.greatlearning.services.*;

public class Driver {

	public static void main(String[] args) {
		AdminDepartment admin = new AdminDepartment();
		HRDepartment hr = new HRDepartment();
		TechDepartment techie = new TechDepartment();
		
		DepartmentFunctions.display(admin);
		System.out.println();
		DepartmentFunctions.display(hr);
		System.out.println();
		DepartmentFunctions.display(techie);
	}

}
