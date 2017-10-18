package com.ry.DI06;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration //表示当前类充当spring 容器，即所有的Bean将由这个类创建
public class myJavaConfig {
	@Bean(name="mySchool")
	public School  mySchoolCreate(){
		return new School("北京大学");
	}
	
	//autowire=Autowire.BY_TYPE 指从当前类这个容器中查找与域属性的类型具有is-a 关系的bean
//	@Bean(name="myStudent",autowire=Autowire.BY_TYPE)
//	public Student myStudentCreate(){
//		return new Student("张三", 23);
//	}
	
	
	//autowire=Autowire.BY_NAME 指从当前类这个容器中查找与域属性同名的bean
	@Bean(name="myStudent",autowire=Autowire.BY_NAME)
	public Student myStudentCreate(){
		return new Student("张三", 23);
	}
	
	
	
	
}
