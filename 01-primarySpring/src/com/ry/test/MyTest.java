package com.ry.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ry.service.ISomeService;
import com.ry.service.SomeServiceImpl;

public class MyTest {
	@Test
	public void test01(){
		ISomeService isome=new SomeServiceImpl();
		
		isome.doSome();
		
	}
	
	
	@Test
	public void test02(){
		//创建容器对象,加载spring配置文件
		//从类路径下查找配置文件
		ApplicationContext  ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		ISomeService service =(ISomeService)ac.getBean("myService");
		service.doSome();
		
	}
	
	
	@Test
	public void test03(){
		//创建容器对象,加载spring配置文件  
		//从项目的根下面找配置文件
		ApplicationContext  ac= new FileSystemXmlApplicationContext("applicationContext.xml");
		ISomeService service =(ISomeService)ac.getBean("myService");
		service.doSome();
		
	}

	//applicationContext 与 beanFactory 的区别
	//这两个容器对于其中 bean的创建时机是不一样的
	//1 applicationContext容器在进行初始化时，会将其中的所有bean对象进行创建
	//缺点 ：占用系统资源（内存、cpu等）
	//优点：响应速度快
	
	//2 beanFactory 容器中的对象，在容器初始化时并不会被创建，而是在真正获取该对象时才创建
	// 缺点：相对来说 响应速度慢；
	//优点： 不多占用系统资源 
	
	//一般情况下 用的是 applicationContext 
	
	
	@Test
	public void test05(){
		//创建beanFactory容器
		BeanFactory  bf=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ISomeService service =(ISomeService)bf.getBean("myService");
		service.doSome();
		
	}
	
}
