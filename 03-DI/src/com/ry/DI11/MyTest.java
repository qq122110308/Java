package com.ry.DI11;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



@SuppressWarnings("deprecation")
public class MyTest {
	@Test
	public void test01(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ry/DI11/applicationContext.xml");
		Student student=(Student)ac.getBean("myStudent");
		System.out.println(student);
		
		
		Student student1=(Student)ac.getBean("myStudent1");
		System.out.println(student1);
		
		Student student2=(Student)ac.getBean("myStudent2");
		System.out.println(student2);
		
	}
	
	
	
	
}
