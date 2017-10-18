package com.ry.daoImpl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ry.dao.IAccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

	@Override
	public void insertAccount(String aname, double money) {
		String sql="insert into account(aname,balance) values(?,?)";
		this.getJdbcTemplate().update(sql,aname,money);		
	}

	@Override
	public void updateAccount(String aname, double money, boolean isBuy) {
		String sql="";
		if(isBuy){
			sql="update account set balance=balance-money where aname=?";
		}
		else{
			sql="update account set balance=balance+money where aname=?";
		}
		this.getJdbcTemplate().update(sql,aname,money);
		 
	}

}
