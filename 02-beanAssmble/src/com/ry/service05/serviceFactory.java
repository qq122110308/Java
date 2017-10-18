package com.ry.service05;

public class serviceFactory {
	public static ISomeService getSomeService(){
		return new SomeServiceImpl() ;
	}
}
