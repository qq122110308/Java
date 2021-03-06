package com.ry.serviceImpl;

import com.ry.dao.IAccountDao;
import com.ry.dao.IStockDao;
import com.ry.service.BuyStockException;
import com.ry.service.IBuyStockService;

public class BuyStockServiceImpl implements IBuyStockService {

	private IAccountDao adao;
	private IStockDao sdao;
	
	
	
	
	public IAccountDao getAdao() {
		return adao;
	}

	public void setAdao(IAccountDao adao) {
		this.adao = adao;
	}

	public IStockDao getSdao() {
		return sdao;
	}

	public void setSdao(IStockDao sdao) {
		this.sdao = sdao;
	}

	@Override
	public void buyStock(String aname, double money, String sname, int amount)  throws BuyStockException{
		boolean isBuy=true;
		adao.updateAccount(aname,money,isBuy);
		if(1==1){
			throw  new BuyStockException("�����Ʊ�쳣");
		}
		sdao.updateStock(sname,amount,isBuy);
	}

	@Override
	public void openAccount(String aname, double money) {
		adao.insertAccount(aname,money);
	}

	@Override
	public void openStock(String sname, int amount) {
		sdao.insertStock(sname,amount);
	}

}
