package com.ry.aop04;

import org.springframework.aop.ThrowsAdvice;

//�쳣֪ͨ
public class MyThrowsAdvice implements ThrowsAdvice {
	
	
	//��Ŀ�귽���׳���ָ�����͵��쳣����is-a��ϵʱ��ִ�е�ǰ����
	public void afterThrowing(Exception ex){
		System.out.println("ִ���쳣֪ͨ");
	}
}
