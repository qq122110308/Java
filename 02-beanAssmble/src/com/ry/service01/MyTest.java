package com.ry.service01;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ry.service01.ISomeService;
import com.ry.service01.SomeServiceImpl;

@SuppressWarnings("deprecation")
public class MyTest {
	@Test
	public void test01(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ry/service01/applicationContext.xml");
		ISomeService service=(ISomeService)ac.getBean("myService");
		service.doSome();
		
	}
	
	
	
	
}
