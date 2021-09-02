package com.greatlearning.models;

public class TechDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Tech Department";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}
}
