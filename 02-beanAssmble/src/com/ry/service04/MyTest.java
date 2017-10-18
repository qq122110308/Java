package com.ry.service04;

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
		//创建容器 ，加载spring配置文件
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ry/service04/applicationContext.xml");
//		serviceFactory factory=(serviceFactory)ac.getBean("myFactory");
//		ISomeService service=factory.getSomeService();
		
		ISomeService service=(ISomeService)ac.getBean("myService");
		
		ISomeService service2=(ISomeService) ac.getBean("myService"); 
		
		System.out.println("service==service2"+ (service==service2));
		
	}
	
	
	

	
	
	
	
	
}
