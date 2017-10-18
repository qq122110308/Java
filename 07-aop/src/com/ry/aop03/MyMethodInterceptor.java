package com.ry.aop03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//环绕通知  目标方法之前之后都执行
//可以修改目标方法的返回结果
public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("执行环绕通知，目标方法执行之前");
		//执行目标方法
		Object result=arg0.proceed();
		System.out.println("执行环绕通知，目标方法执行之后");
		if(result!=null){
			result=((String)result).toUpperCase();
		}
		return result;
	}

}
