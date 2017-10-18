package com.ry.aop05;

//异常分两种：
// 运行时异常  若一个类继承RunTimeException,则该异常是运行时异常
// 编译时异常  若一个类继承Exception ,则该异常是受查异常
public class UserException extends Exception {
	
	public UserException(){
		super();
	}
	
	public UserException(String message){
		super(message);
	}
	
}
