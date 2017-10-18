package com.ry.aop11;

public class someServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst方法");
	}

	@Override
	public String doSecond() {
		System.out.println("执行doSecond方法");
		
		return "abcde";
	}

	@Override
	public void doThird() {
		System.out.println("执行doThird方法");
	}

	
	
}
