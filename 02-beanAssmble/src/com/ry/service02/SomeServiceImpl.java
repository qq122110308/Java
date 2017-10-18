package com.ry.service02;

public class SomeServiceImpl  implements ISomeService{
	
	private int a;
//	
//	//一个没有成员变量的对象在堆内存中占8个字节
//	//Object obj=new Object();
//	
//	//动态代码块  在构造函数前实现
//	{
//		System.out.println("执行动态代码块a="+a);
//	}
//	
//	public SomeServiceImpl() {
//		System.out.println("创建对象 a="+a);
//	}
	
	
	public SomeServiceImpl() {
		System.out.println("执行无参构造器");
	}
	
	
	
//	public SomeServiceImpl(int a){
//		this.a=a;
//	}
//	
	
	@Override
	public void doSome() {
		// TODO Auto-generated method stub
		System.out.println("执行doSome方法");
	} 
	
}
