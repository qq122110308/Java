package com.ry.DI06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


//使用 junit 测试 貌似不行    要加上注解这里

public class MyTest {
	@Test
	public void test01(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ry/DI05/applicationContext.xml");
		Student student=(Student)ac.getBean("myStudent");
		System.out.println(student);
		
	}
	
	
	
	
}
