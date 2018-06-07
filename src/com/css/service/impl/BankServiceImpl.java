package com.css.service.impl;

import com.css.dao.BankDao;
import com.css.dao.impl.BankDaoImpl;
import com.css.entity.Bank;
import com.css.service.BankService;

public class BankServiceImpl implements BankService {
BankDao dao =new BankDaoImpl();
	@Override
	public boolean upadateBalance(float balance, int bankNumber) {
		// TODO Auto-generated method stub
		return dao.upadateBalance(balance, bankNumber);
	}
	
	


	@Override
	public float queryBalance(int bankNumber) {
		// TODO Auto-generated method stub
		Bank bank = (Bank)dao.queryByUserId(bankNumber);
		if (bank!=null) {
		return bank.getBalance();
		}
		return 0;
	}




	@Override
	public Bank bindBank(String bankNumber, String bankPwd) {
		// TODO Auto-generated method stub
		return dao.bindBank(bankNumber, bankPwd);
	}




	@Override
	public Bank queryBank(int bankNumber) {
		// TODO Auto-generated method stub
		return dao.queryBank(bankNumber);
	}




	@Override
	public boolean accountTransfer(int bankNumber, float money) {
		// TODO Auto-generated method stub
		return dao.accountTransfer(bankNumber, money);
	}

}
