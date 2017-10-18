package com.ry.DI01;

public class Student {
	private String name;
	private int age;
	
	private School school; //对象属性  ,域属性
	
	public void setName(String name) {
		this.name = name;
		System.out.println("执行setter方法");
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("执行setter方法");
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
