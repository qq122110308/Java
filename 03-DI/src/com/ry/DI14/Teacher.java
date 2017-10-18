package com.ry.DI14;

public class Teacher {
	private String name;
	private int workAge;
	private String school;
	private String department;
	public void setName(String name) {
		this.name = name;
	}
	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Teacher [department=" + department + ", name=" + name
				+ ", school=" + school + ", workAge=" + workAge + "]";
	}
	
	
	
	
}
