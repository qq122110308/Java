package com.ry.aop08;

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
