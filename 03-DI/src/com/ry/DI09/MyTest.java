package com.ry.DI09;

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
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ry/DI09/applicationContext.xml");
		Student student=(Student)ac.getBean("myStudent");
		System.out.println(student);
		
		Person  person=(Person)ac.getBean("myPerson");
		System.out.println(person);
		
		
	}
	
	
	
	
}