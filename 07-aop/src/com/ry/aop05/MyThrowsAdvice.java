package com.ry.aop05;

import org.springframework.aop.ThrowsAdvice;

//�쳣֪ͨ
public class MyThrowsAdvice implements ThrowsAdvice {
	
	
	//��Ŀ�귽���׳���ָ�����͵��쳣����is-a��ϵʱ��ִ�е�ǰ����
	public void afterThrowing(UsernameException ex){
		System.out.println("�����û����쳣");
	}
	
	public void afterThrowing(PasswordException ex){
		System.out.println("�����û����쳣");
	}
	
	
	public void afterThrowing(Exception ex){
		System.out.println("�����쳣");
	}
}
