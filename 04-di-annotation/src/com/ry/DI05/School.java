package com.ry.DI05;

public class School {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String name) {
		super();
		this.name = name;
	}
	
	
	
}
