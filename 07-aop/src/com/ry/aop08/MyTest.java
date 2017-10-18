package com.ry.aop08;

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
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ry/aop08/applicationContext.xml");
		ISomeService service =(ISomeService) ac.getBean("serviceProxy");
		
		service.doFirst();
		System.out.println("============");
		System.out.println(service.doSecond());
	}
	
	
	
	
}
