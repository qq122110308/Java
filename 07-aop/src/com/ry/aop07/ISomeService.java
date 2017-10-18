package com.ry.aop07;

public class ISomeService  {

	public void doFirst() {
		System.out.println("执行doFirst方法");
	}

	public String doSecond() {
		System.out.println("执行doSecond方法");
		
		return "abcde";
	}

	
	
}
