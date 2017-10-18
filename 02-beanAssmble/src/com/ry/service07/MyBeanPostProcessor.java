package com.ry.service07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	//bean����ʾ��ǰ���ڽ��г�ʼ����bean����
	//beanName : ��ʾ��ǰ���ڽ��г�ʼ����bean�����id
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
			System.out.println("Step8:ִ�� after");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(final Object bean, String beanName)
			throws BeansException {
			System.out.println("Step5:ִ��before");
			
				return bean;
				
			
	}

}
