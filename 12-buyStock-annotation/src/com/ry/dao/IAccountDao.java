package com.ry.dao;

public interface IAccountDao {

	void updateAccount(String aname, double money, boolean isBuy);

	void insertAccount(String aname, double money);
	
}
