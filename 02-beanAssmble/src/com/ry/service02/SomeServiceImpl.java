package com.ry.service02;

public class SomeServiceImpl  implements ISomeService{
	
	private int a;
//	
//	//һ��û�г�Ա�����Ķ����ڶ��ڴ���ռ8���ֽ�
//	//Object obj=new Object();
//	
//	//��̬�����  �ڹ��캯��ǰʵ��
//	{
//		System.out.println("ִ�ж�̬�����a="+a);
//	}
//	
//	public SomeServiceImpl() {
//		System.out.println("�������� a="+a);
//	}
	
	
	public SomeServiceImpl() {
		System.out.println("ִ���޲ι�����");
	}
	
	
	
//	public SomeServiceImpl(int a){
//		this.a=a;
//	}
//	
	
	@Override
	public void doSome() {
		// TODO Auto-generated method stub
		System.out.println("ִ��doSome����");
	} 
	
}
