package com.ry.aop07;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

// jdk 的动态代理
// 如果不用 接口 那么是 cglib 动态代理

@SuppressWarnings("deprecation")
public class MyTest {
	@Test
	public void test01(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ry/aop07/applicationContext.xml");
		
		//加断点
		ISomeService service =(ISomeService) ac.getBean("serviceProxy");
		
		service.doFirst();
		System.out.println("============");
		System.out.println(service.doSecond());
	}
	
	
	
	
}
