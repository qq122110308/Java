package com.ry.aop13;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
//����֪ͨ
public class MyAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	//��Ŀ�귽��ִ��֮��ִ��
	//arg0: Ŀ�귽���ķ���ֵ
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("ִ�к���֪ͨ arg0="+arg0);
	}
	
}
