package com.ry.aop04;

public class someServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("ִ��doFirst����"+3/0);
	}

	@Override
	public String doSecond() {
		System.out.println("ִ��doSecond����");
		
		return "abcde";
	}

	
	
}
