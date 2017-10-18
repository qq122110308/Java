package com.ry.service07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	//bean：表示当前正在进行初始化的bean对象
	//beanName : 表示当前正在进行初始化的bean对象的id
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
			System.out.println("Step8:执行 after");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(final Object bean, String beanName)
			throws BeansException {
			System.out.println("Step5:执行before");
			
				return bean;
				
			
	}

}
