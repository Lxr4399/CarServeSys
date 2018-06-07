package com.css.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.css.dao.BankDao;
import com.css.entity.Bank;
import com.css.entity.Users;
import com.css.service.BankService;
import com.css.service.impl.BankServiceImpl;
import com.css.util.DBUtil;

public class BankDaoImpl implements BankDao {
	/**
	 * 更改余额用于转账操作
	 */
	@Override
	public boolean upadateBalance(float balance, int bankNumber) {
		// TODO Auto-generated method stub
		return DBUtil.execute("update bank set balance=balance+? where bankNumber=?", balance, bankNumber) > 0;

	}

	@Override
	public Bank queryByUserId(int bankNumber) {
		// TODO Auto-generated method stub
		List<Bank> list = (List<Bank>) DBUtil.select("select * from bank where bankNumber=?", Bank.class, bankNumber);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Bank bindBank(String bankNumber, String bankPwd) {
		// TODO Auto-generated method stub
		List<Bank> list = (List<Bank>) DBUtil.select("select * from bank where bankNumber=? and bankPwd=?", Bank.class,
				bankNumber, bankPwd);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Bank queryBank(int bankNumber) {
		// TODO Auto-generated method stub
		List<Bank> list = (List<Bank>) DBUtil.select("select * from bank where bankNumber=?", Bank.class, bankNumber);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public boolean accountTransfer(int bankNumber, float money) {
		// TODO Auto-generated method stub
		BankService bs = new BankServiceImpl();
		if (bs.queryBalance(bankNumber) >= money) {
			bs.upadateBalance(-money, bankNumber);
			return true;
        
		}
		return false;

	}

}
