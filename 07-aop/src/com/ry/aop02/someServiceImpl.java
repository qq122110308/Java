package com.ry.aop02;

public class someServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("ִ��doFirst����");
	}

	@Override
	public String doSecond() {
		System.out.println("ִ��doSecond����");
		
		return "abcde";
	}

	
	
}
