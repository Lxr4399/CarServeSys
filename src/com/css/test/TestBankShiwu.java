package com.css.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.css.service.BankService;
import com.css.service.FuelcardService;
import com.css.service.impl.BankServiceImpl;
import com.css.service.impl.FuelcardServiceImpl;
import com.css.util.DBUtil;

public class TestBankShiwu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn =DBUtil.getConn();
		BankService bs = new BankServiceImpl();
		FuelcardService fs = new FuelcardServiceImpl();
		try {
			conn.setAutoCommit(false);
			if (bs.queryBalance(78456)>=4) {
				bs.upadateBalance(-4, 78456);
				boolean flag = fs.upadateBalance(34561231, 4);
				if (flag) {
				conn.commit();
				System.out.println("充值成功");
				}
				else System.out.println("卡号有wu");
			}
			else System.out.println("余额不足，当前余额为"+bs.queryBalance(22));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
			
}
}