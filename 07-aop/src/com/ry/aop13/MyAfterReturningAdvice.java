package com.ry.aop13;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
//后置通知
public class MyAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	//在目标方法执行之后执行
	//arg0: 目标方法的返回值
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("执行后置通知 arg0="+arg0);
	}
	
}
