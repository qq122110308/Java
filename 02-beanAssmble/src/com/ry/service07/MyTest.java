package com.ry.service07;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class MyTest {
	@Test
	public void test01(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/ry/service07/applicationContext.xml");
		ISomeService service=(ISomeService)ac.getBean("myService");
		service.doSome();
		//�������ٷ�����ִ�� ������������
		//1 ��ǰbean��Ҫ�� singleton��
		//2 Ҫ�ֶ��ر�����
		
		((ClassPathXmlApplicationContext)ac).close();
		
	}
	
	
	
	
}
