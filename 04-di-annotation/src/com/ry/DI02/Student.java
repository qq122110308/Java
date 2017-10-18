package com.ry.DI02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
	@Value("张三")
	private String name;
	@Value("23")
	private int age;
	
	@Autowired  
	@Qualifier("mySchool") //byName 方式的注解式注入, 要求@Autowired 和 @Qualifier 联合使用
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
