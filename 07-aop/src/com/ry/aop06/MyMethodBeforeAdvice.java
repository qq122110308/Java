package com.ry.aop06;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//前置通知
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	//当前方法在目标方法执行之前执行
	//method :目标方法
	//arg1 :目标方法参数列表
	// arg2 :目标对象
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		//对于目标方法的增强应该写在这里
		System.out.println("执行前置通知方法！");
	}

}
