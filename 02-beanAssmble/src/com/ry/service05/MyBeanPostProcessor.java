package com.ry.service05;

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
			System.out.println("执行 after");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(final Object bean, String beanName)
			throws BeansException {
			System.out.println("执行before");
			if("myService2".equals(beanName)){
				Object obj = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						
						Object invoke =method.invoke(bean, args);
						if("dosome2".equals(method.getName())){
							
							return ((String)invoke).toUpperCase();
						}
						else{
							return invoke;
						}
						// TODO Auto-generated method stub
					}
				});
				
			return obj;
			}
			else{
				return bean;
				
			}
	}

}
