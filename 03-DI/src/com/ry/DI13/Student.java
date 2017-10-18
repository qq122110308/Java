package com.ry.DI13;

public class Student {
	private String name;
	private int age;
	private String school;
	private String department;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", department=" + department + ", name="
				+ name + ", school=" + school + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
