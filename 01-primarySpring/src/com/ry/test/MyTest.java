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
		//������������,����spring�����ļ�
		//����·���²��������ļ�
		ApplicationContext  ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		ISomeService service =(ISomeService)ac.getBean("myService");
		service.doSome();
		
	}
	
	
	@Test
	public void test03(){
		//������������,����spring�����ļ�  
		//����Ŀ�ĸ������������ļ�
		ApplicationContext  ac= new FileSystemXmlApplicationContext("applicationContext.xml");
		ISomeService service =(ISomeService)ac.getBean("myService");
		service.doSome();
		
	}

	//applicationContext �� beanFactory ������
	//������������������ bean�Ĵ���ʱ���ǲ�һ����
	//1 applicationContext�����ڽ��г�ʼ��ʱ���Ὣ���е�����bean������д���
	//ȱ�� ��ռ��ϵͳ��Դ���ڴ桢cpu�ȣ�
	//�ŵ㣺��Ӧ�ٶȿ�
	
	//2 beanFactory �����еĶ�����������ʼ��ʱ�����ᱻ������������������ȡ�ö���ʱ�Ŵ���
	// ȱ�㣺�����˵ ��Ӧ�ٶ�����
	//�ŵ㣺 ����ռ��ϵͳ��Դ 
	
	//һ������� �õ��� applicationContext 
	
	
	@Test
	public void test05(){
		//����beanFactory����
		BeanFactory  bf=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ISomeService service =(ISomeService)bf.getBean("myService");
		service.doSome();
		
	}
	
}
