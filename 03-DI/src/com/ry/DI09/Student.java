package com.ry.DI09;

public class Student {
	private String name;
	private int age;
	
	
	public void setName(String name) {
		this.name = name;
		System.out.println("ִ��setter����");
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("ִ��setter����");
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
