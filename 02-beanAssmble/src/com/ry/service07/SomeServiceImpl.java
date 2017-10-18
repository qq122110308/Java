package com.ry.service07;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SomeServiceImpl  implements ISomeService,BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean{

	private String adao;
	private String bdao;
	
	public void setAdao(String adao){
		this.adao=adao;
		System.out.println("Step2:ִ��setter");
	}
	
	public void setBdao(String bdao){
		this.bdao=bdao;
		System.out.println("Step2:ִ��setter");
	}
	
	public SomeServiceImpl() {
		System.out.println("Step1:ִ���޲ι�����");
	}
	@Override
	public void doSome() {
		System.out.println("Step9:ִ��doSome����");
	} 
	public void setUp(){
		System.out.println("Step7:��ʼ�����֮��");
	}
	public void tearDown(){
		System.out.println("Step:11:����֮ǰ");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Step3:��ȡ��bean��id��"+name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Step4:��ȡ��beanFactory����:");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Step6:bean��ʼ�������");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Step10:ʵ�ֽӿڵ�����֮ǰ");
	}
	
	

	
	
	
	
	
	

}
