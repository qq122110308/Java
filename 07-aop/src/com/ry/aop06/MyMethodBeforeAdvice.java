package com.ry.aop06;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//ǰ��֪ͨ
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	//��ǰ������Ŀ�귽��ִ��֮ǰִ��
	//method :Ŀ�귽��
	//arg1 :Ŀ�귽�������б�
	// arg2 :Ŀ�����
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		//����Ŀ�귽������ǿӦ��д������
		System.out.println("ִ��ǰ��֪ͨ������");
	}

}
