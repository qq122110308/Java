package com.ry.DI01;

public class Student {
	private String name;
	private int age;
	
	private School school; //��������  ,������
	
	public void setName(String name) {
		this.name = name;
		System.out.println("ִ��setter����");
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("ִ��setter����");
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", school=" + school
				+ "]";
	}
	
	
	
	
	
	
	
	
}
