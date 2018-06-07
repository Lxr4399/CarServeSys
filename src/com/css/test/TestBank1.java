package com.css.test;

import com.css.dao.BankDao;
import com.css.dao.impl.BankDaoImpl;
import com.css.entity.Bank;
import com.css.service.BankService;
import com.css.service.impl.BankServiceImpl;

public class TestBank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService bs= new BankServiceImpl();
//       BankDao dao =new BankDaoImpl();
//       dao.upadateBalance(-5, 1);
//       Bank banl =(Bank)dao.queryByUserId(1);
//       System.out.println(bs.queryBalance(1));
//		Bank bank =bs.bindBank("78456", "123");
//		System.out.println(bank.toString());
		
		//测试转账
		boolean flag  = bs.accountTransfer(78456, 100);
		if (flag) {
			System.out.println("转账成功：余额为"+bs.queryBalance(78456));
		}
	}

}
