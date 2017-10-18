package com.ry.service05;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.serviceloader.ServiceFactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


@SuppressWarnings("deprecation")
public class MyTest {
	
	
	
	@Test
	public void test01(){
		//�������� ������spring�����ļ�
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ry/service05/applicationContext.xml");
//		serviceFactory factory=(serviceFactory)ac.getBean("myFactory");
//		ISomeService service=factory.getSomeService();
		
		ISomeService service=(ISomeService)ac.getBean("myService");
		System.out.println(service.doSome());
		
		ISomeService service2=(ISomeService)ac.getBean("myService2");
		System.out.println(service2.doSome());
	}
	
	
	

	
	
	
	
	
}
