package com.ry.test;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ry.beans.Student;
import com.ry.dao.IStudentDao;
import com.ry.service.IStudentService;



@SuppressWarnings("deprecation")
public class MyTest {
	IStudentService service=null;
	
	@Before
	public void before(){		
		String resource="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
		IStudentService service=(IStudentService) ac.getBean("studentService");
	}
	
	@Test 
	public void test01(){	
		
		//这一段 我放在before 方法的 时候  会报 空指针异常
		String resource="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
		IStudentService service=(IStudentService) ac.getBean("studentService");
	
		Student student =new Student("张三",23);
		service.addStudent(student);
	}
	
	@Test
	public void test02(){		
		service.removeById(2);
	}
	
	@Test
	public void test04(){
		
		List<String> list = service.findAllStudentNames();
		
		System.out.println(list);
	}
	
	
	@Test
	public void test05(){
		System.out.println(service.findStudentNameById(3));
	}
	
	@Test
	public void test06(){
		
		//这一段 我放在before 方法的 时候  会报 空指针异常
		String resource="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
		IStudentService service=(IStudentService) ac.getBean("studentService");
		
		List<Student> students=service.findAllStudent();
		for(Student student :students){
			System.out.println(student);
		}
	}
	
	@Test
	public void test07(){
		Student student=service.findStudentById(1);
		
		System.out.println(student);
	}
	
	
	
}
