package com.ry.aop13;

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
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ry/aop13/applicationContext.xml");
		ISomeService service =(ISomeService) ac.getBean("someService");
		
		service.doFirst();
		System.out.println("============");
		System.out.println(service.doSecond());
		System.out.println("============");
		service.doThird();
		
		
ISomeService service2 =(ISomeService) ac.getBean("someService2");
		
		service2.doFirst();
		System.out.println("============");
		System.out.println(service2.doSecond());
		System.out.println("============");
		service2.doThird();
	}
	
	
	
	
}
