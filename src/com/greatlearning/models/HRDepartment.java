package com.greatlearning.models;

public class HRDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "HR Department";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Fill today's worksheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team lunch";
	}
}
