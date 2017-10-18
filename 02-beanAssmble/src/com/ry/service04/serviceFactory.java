package com.ry.service04;

public class serviceFactory {
	public static ISomeService getSomeService(){
		return new SomeServiceImpl() ;
	}
}
