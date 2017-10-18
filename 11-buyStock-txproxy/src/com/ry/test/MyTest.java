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

import com.ry.service.BuyStockException;
import com.ry.service.IBuyStockService;




@SuppressWarnings("deprecation")
public class MyTest {
	private IBuyStockService service=null;
	
	@Before
	public void before(){		
		String resource="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
		IBuyStockService service=(IBuyStockService) ac.getBean("serviceProxy");
	}
	
	@Test
	public void test01(){
		String resource="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(resource);
		IBuyStockService service=(IBuyStockService) ac.getBean("buyStockService");
		service.openAccount("����", 10000);
		service.openStock("���������ڵ�", 0);
	}
	
	
	@Test
	public void test02(){
		try {
			service.buyStock("����",2000, "���������ڵ�",5);
		} catch (BuyStockException e) {
			e.printStackTrace();
		}
	}
	
	
}
