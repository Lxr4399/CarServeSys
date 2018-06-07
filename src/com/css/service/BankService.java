package com.css.service;

import com.css.entity.Bank;

public interface BankService {
	/**
	 * 更改余额，本方法用于转账操作
	 */
		public boolean upadateBalance (float balance,int bankNumber);
		
		public float queryBalance (int bankNumber);
		/**
		 * 银行卡绑定
		 * @param bankNumber
		 * @param bankPwd
		 * @return
		 */
		public Bank bindBank (String bankNumber,String bankPwd);
		
		
		
		public Bank queryBank(int bankNumber);
		
		
		/**
		 * 银行卡转账
		 * @param 银行卡号
		 * @param 转账金额
		 * @return 成功返还true，反之false
		 */
		public boolean accountTransfer (int bankNumber,float money); 
}
