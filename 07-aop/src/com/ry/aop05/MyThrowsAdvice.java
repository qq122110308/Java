package com.ry.aop05;

import org.springframework.aop.ThrowsAdvice;

//异常通知
public class MyThrowsAdvice implements ThrowsAdvice {
	
	
	//当目标方法抛出与指定类型的异常具有is-a关系时，执行当前方法
	public void afterThrowing(UsernameException ex){
		System.out.println("发生用户名异常");
	}
	
	public void afterThrowing(PasswordException ex){
		System.out.println("发生用户名异常");
	}
	
	
	public void afterThrowing(Exception ex){
		System.out.println("其他异常");
	}
}
