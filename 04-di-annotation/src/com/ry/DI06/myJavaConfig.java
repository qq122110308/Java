package com.ry.DI06;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration //��ʾ��ǰ��䵱spring �����������е�Bean��������ഴ��
public class myJavaConfig {
	@Bean(name="mySchool")
	public School  mySchoolCreate(){
		return new School("������ѧ");
	}
	
	//autowire=Autowire.BY_TYPE ָ�ӵ�ǰ����������в����������Ե����;���is-a ��ϵ��bean
//	@Bean(name="myStudent",autowire=Autowire.BY_TYPE)
//	public Student myStudentCreate(){
//		return new Student("����", 23);
//	}
	
	
	//autowire=Autowire.BY_NAME ָ�ӵ�ǰ����������в�����������ͬ����bean
	@Bean(name="myStudent",autowire=Autowire.BY_NAME)
	public Student myStudentCreate(){
		return new Student("����", 23);
	}
	
	
	
	
}
