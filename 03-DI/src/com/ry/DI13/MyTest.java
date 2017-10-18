package com.ry.DI13;

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
		
		//ΪӦ��ָ����������ļ�  --ƽ�ȹ�ϵ
		
//		String resource="com/ry/DI13/applicationContext.xml";
//		String resource1="com/ry/DI13/springBase.xml";
//		ApplicationContext ac=new ClassPathXmlApplicationContext(resource,resource1);

		//����
//		String resource="com/ry/DI13/applicationContext.xml";
//		String resource1="com/ry/DI13/springBase.xml";
//		String[] resources={resource,resource1};
//		ApplicationContext ac=new ClassPathXmlApplicationContext(resources);
//	
		//ͨ���
		String resource="com/ry/DI13/spring*.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
		
		Student student=(Student)ac.getBean("myStudent");
		System.out.println(student);
		
		
		
		
		Teacher student2=(Teacher)ac.getBean("myTeacher");
		System.out.println(student2);
		
	}
	
	
	
	
}
