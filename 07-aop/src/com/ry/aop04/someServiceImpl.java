package com.ry.aop04;

public class someServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst方法"+3/0);
	}

	@Override
	public String doSecond() {
		System.out.println("执行doSecond方法");
		
		return "abcde";
	}

	
	
}
