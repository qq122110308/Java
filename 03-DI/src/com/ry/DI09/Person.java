package com.ry.DI09;

public class Person {
	private String pname;
	private int ppage;
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPpage(int ppage) {
		this.ppage = ppage;
	}
	
	
	
	public String getPname() {
		return pname;
	}
	public int getPpage() {
		return ppage;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", ppage=" + ppage + "]";
	}
	
	public int computeAge(){
		return ppage>25? 25: ppage;
	}
	
	
}
