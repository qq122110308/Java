package com.ry.aop05;

//�쳣�����֣�
// ����ʱ�쳣  ��һ����̳�RunTimeException,����쳣������ʱ�쳣
// ����ʱ�쳣  ��һ����̳�Exception ,����쳣���ܲ��쳣
public class UserException extends Exception {
	
	public UserException(){
		super();
	}
	
	public UserException(String message){
		super(message);
	}
	
}
