package com.ry.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect  //��ʾ��ǰ��Ϊ����
public class MyAspect {
	
	@Before("execution(* *..ISomeService.doFirst(..))")
	public void myBefore(){
		System.out.println("ִ��ǰ��֪ͨ����");
	}
	
	
	@Before("execution(* *..ISomeService.doFirst(..))")
	public void myBefore(JoinPoint jp){
		System.out.println("ִ��ǰ��֪ͨ����  jp="+jp);
	}
	
	@AfterReturning("execution(* *..ISomeService.doSecond(..))")
	public void myAfterReturning(){
		System.out.println("ִ�к���֪ͨ����");
	}
	
	@AfterReturning(value="execution(* *..ISomeService.doSecond(..))",returning="result")
	public void myAfterReturning(Object result){
		System.out.println("ִ�к���֪ͨ����  result="+result);
	}
	
	
	@Around("execution(* *..ISomeService.doSecond(..))")
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("ִ�л���֪ͨ������Ŀ�귽��ִ��֮ǰ");
		Object result = pjp.proceed();
		System.out.println("ִ�л���֪ͨ������Ŀ�귽��ִ��֮��");
		if(result!=null){
			result=((String)result).toUpperCase();
		}
		
		return result;
	}
	
	
	@AfterThrowing("execution(* *..ISomeService.doThird(..))")
	public void myAfterThrowing(){
		System.out.println("ִ���쳣֪ͨ���� ");
	}
	
	@AfterThrowing(value="execution(* *..ISomeService.doThird(..))",throwing="ex")
	public void myAfterThrowing(Exception ex){
		System.out.println("ִ���쳣֪ͨ����  ex="+ex.getMessage());
	}
	
	
	@After("doThridPointcut()")
	public void myAfter(){
		System.out.println("ִ������֪ͨ���� ");
	}
	
	//������һ������㣬��doThridPointcut
	@Pointcut("execution(* *..ISomeService.doThird(..))") 
	public void doThirdPointcut(){};
	
}
