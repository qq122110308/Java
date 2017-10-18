package com.ry.DI03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
	@Value("����")
	private String name;
	@Value("23")
	private int age;

	//@Resource(name="mySchool")  //byName ��ʽ��ע��ʽע��
	//@Resource //byType ��ʽ��ע��ʽע��
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
