package com.ry.dao;

public interface IStockDao {

	void updateStock(String sname, int amount, boolean isBuy);

	void insertStock(String sname, int amount);
	

}
