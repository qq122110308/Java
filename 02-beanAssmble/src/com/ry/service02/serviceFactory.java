package com.ry.service02;

public class serviceFactory {
	public  ISomeService getSomeService(){
		return new SomeServiceImpl() ;
	}
}
