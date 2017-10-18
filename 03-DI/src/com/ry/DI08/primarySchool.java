package com.ry.DI08;

public class primarySchool extends School{
	private String adress;

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "primarySchool [adress=" + adress + "]";
	}

	
}
