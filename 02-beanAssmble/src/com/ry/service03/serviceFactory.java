package com.ry.service03;

public class serviceFactory {
	public static ISomeService getSomeService(){
		return new SomeServiceImpl() ;
	}
}
