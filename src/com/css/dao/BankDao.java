package com.css.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.css.entity.Bank;
import com.css.service.BankService;
import com.css.service.FuelcardService;
import com.css.service.impl.BankServiceImpl;
import com.css.service.impl.FuelcardServiceImpl;
import com.css.util.DBUtil;

public interface BankDao {
/**
 * 更改余额，本方法用于转账操作
 */
	public boolean upadateBalance (float balance,int bankNumber);
	/**
	 * 余额，查询，用于事务判断
	 */
	public Bank queryByUserId (int bankNumber);
	
	/**
	 * 银行卡绑定
	 * @param bankNumber
	 * @param bankPwd
	 * @return
	 */
	public Bank bindBank (String bankNumber,String bankPwd);
	
	
	/**
	 * 根据银行卡号获取银行卡对象，前提是已绑定
	 * 
	 */
	public Bank queryBank (int bankNumber);
	
	/**
	 * 银行卡转账
	 * @param 银行卡号
	 * @param 转账金额
	 * @return 成功返还true，反之false
	 */
	public boolean accountTransfer (int bankNumber,float money); 
}
