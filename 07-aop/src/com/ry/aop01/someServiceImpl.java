package com.ry.aop01;

public class someServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst方法");
	}

	@Override
	public void doSecond() {
		System.out.println("执行doSecond方法");
	}

	
	
}
