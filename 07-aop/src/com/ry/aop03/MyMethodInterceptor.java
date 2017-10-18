package com.ry.aop03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//����֪ͨ  Ŀ�귽��֮ǰ֮��ִ��
//�����޸�Ŀ�귽���ķ��ؽ��
public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("ִ�л���֪ͨ��Ŀ�귽��ִ��֮ǰ");
		//ִ��Ŀ�귽��
		Object result=arg0.proceed();
		System.out.println("ִ�л���֪ͨ��Ŀ�귽��ִ��֮��");
		if(result!=null){
			result=((String)result).toUpperCase();
		}
		return result;
	}

}
